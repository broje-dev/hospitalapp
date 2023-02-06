package com.hospital1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital1.entity.Patients;

public interface PatientsRepository extends JpaRepository<Patients, Long> {

}
