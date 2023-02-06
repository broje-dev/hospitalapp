package com.hospital1.controller;

import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowPrintStacktrace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital1.entity.Patients;
import com.hospital1.repository.PatientsRepository;

@RestController
@RequestMapping("/api/patients")
public class PatientRestController {
	@Autowired
	private PatientsRepository patientRepo;
	@GetMapping
public List<Patients> getAllPatients(){
	List<Patients> patients = patientRepo.findAll();
	return patients ;
}
	@PostMapping
	public void saveOnePatient(@RequestBody Patients patient) {
		patientRepo.save(patient);
		
	}
	@PutMapping
	public void updateOnePatient(@RequestBody Patients patient) {
		patientRepo.save(patient);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteOnePatient(@PathVariable("id") long id) {
		patientRepo.deleteById(id);
	}
	@GetMapping("/find/{id}")
	public Patients getOnePatient(@PathVariable("id")long id) {
		Optional<Patients> patient = patientRepo.findById(id);
		Patients patients = patient.get();
		return patients;
	}
	
}
