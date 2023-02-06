package com.hospital1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hospital1.entity.Patients;
import com.hospital1.service.PatientsService;
import com.hospital1.util.EmailService;

@Controller
public class PatientController {
	
	@Autowired
	private PatientsService patientService;
	//localhost:8080/createPatient
	@RequestMapping("/createPatient")
public String createReg() {
	return"registration";
}
	@RequestMapping("/savePatientReg")
	public String savePatientForm(Patients patient) {
		
		patientService.savePatientReg(patient);
		return "registration";
	}
	@RequestMapping("/listall")
	public String listAll(Model model) {
		List<Patients> patients = patientService.getall();
		model.addAttribute("patient", patients);
		return "listPatient";
	}
	@RequestMapping("/delete")
	public String deleteByid(@RequestParam("id") long id,Model model) {
		patientService.deletePatient(id);
		List<Patients> patients = patientService.getall();
		model.addAttribute("patient", patients);
		return "listPatient";
		}
	@RequestMapping("/update")
	public String updateByid(@RequestParam("id") long id,Model model) {
		Patients updatePatient = patientService.updatePatient(id);
		model.addAttribute("update", updatePatient);
		return "update";
	}
	@RequestMapping("/saveUpdateReg")
	public String updatePatientinfo(Patients patient,Model model) {
		patientService.savePatientReg(patient);
		List<Patients> patients = patientService.getall();
		model.addAttribute("patient", patients);
		return "listPatient";
	
}
}