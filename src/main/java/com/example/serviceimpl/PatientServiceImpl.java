package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Patient;
import com.example.entity.VitalParam;
import com.example.generator.PatientDataGenerator;
import com.example.repository.PatientRepostitory;
import com.example.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	PatientRepostitory patientRepository;

	@Override
	public List<Patient> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Patient insert(Patient patient) {
		

		Map<String,Integer> patientMap = new HashMap<>();
		List<VitalParam> vitalParamList = new ArrayList<>();
		PatientDataGenerator patientDataGenerator = new PatientDataGenerator();
		patientMap = patientDataGenerator.getData();
		
		VitalParam vitalParam= new VitalParam(patientMap.get("temperature"),patientMap.get("heartRate"),patientMap.get("bloodPressureHigh"),patientMap.get("bloodPressureLow"),patientMap.get("respiratoryRate"),new Date());
		vitalParamList.add(vitalParam);
		patient.setVitalParam(vitalParamList);
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
