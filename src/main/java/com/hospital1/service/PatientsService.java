package com.hospital1.service;

import java.util.List;

import com.hospital1.entity.Patients;

public interface PatientsService {
public void savePatientReg(Patients patient);

public List<Patients>getall();

public void deletePatient(long id);

public Patients updatePatient(long id);

}
