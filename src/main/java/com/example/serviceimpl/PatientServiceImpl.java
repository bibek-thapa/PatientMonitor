package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Patient;
import com.example.repository.PatientRepository;
import com.example.repository.VitalRepository;
import com.example.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	VitalRepository vitalRepository;

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient insert(Patient patient) {
		
		return patientRepository.save(patient);
		
	}

	@Override
	public Patient getById(Long id) {
		return patientRepository.getOne(id);
	}

	@Override
	public Patient delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient update(Patient c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
