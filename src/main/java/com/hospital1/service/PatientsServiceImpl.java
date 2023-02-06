package com.hospital1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital1.entity.Patients;
import com.hospital1.repository.PatientsRepository;
@Service
public class PatientsServiceImpl implements PatientsService {
	@Autowired
private PatientsRepository patientsRepo;
	@Override
	public void savePatientReg(Patients patient) {
		patientsRepo.save(patient);

	}
	@Override
	public List<Patients> getall() {
		List<Patients> patients = patientsRepo.findAll();
		return patients;
	}
	@Override
	public void deletePatient(long id) {
		patientsRepo.deleteById(id);
	}
	@Override
	public Patients updatePatient(long id) {
		Optional<Patients> findById = patientsRepo.findById(id);
		Patients patients = findById.get();
		return patients;
	}
	

}
