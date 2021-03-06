package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Patient;

@Repository
public interface PatientRepostitory extends JpaRepository<Patient, Long> {
	
	Patient findByEmail(String email);

}
