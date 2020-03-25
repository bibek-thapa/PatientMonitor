package com.example.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.PatientDTO;
import com.example.dto.PatientVitalParamDTO;
import com.example.entity.Patient;
import com.example.entity.PatientVitalParam;
import com.example.entity.VitalParam;
import com.example.generator.PatientDataGenerator;
import com.example.repository.PatientRepostitory;
import com.example.repository.VitalRepository;
import com.example.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	
	Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PatientRepostitory patientRepository;
	
	@Autowired
	VitalRepository VitalRepository;
	
	@Autowired
	PatientDataGenerator patientDataGenerator;

	@Override
	public List<PatientDTO> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(PatientDTO patientDTO) {
//		List<VitalParam> vitalParamList = new ArrayList<>();
//		
//		Patient patienttemp = new Patient();
//		Map<String,Integer> patientMap = new HashMap<>();
//		patientMap = patientDataGenerator.getData();
//		VitalParam vitalParam1= new VitalParam(patientMap.get("temperature"),patientMap.get("heartRate"),patientMap.get("bloodPressureHigh"),patientMap.get("bloodPressureLow"),patientMap.get("respiratoryRate"),new Date());
//		vitalParamList.add(vitalParam1);
//		
//		
//			VitalRepository.save(vitalParam1);
//			patienttemp = patientRepository.findByEmail(patient.getEmail());
//			//patienttemp.setVitalParam(vitalParamList);
		
		Patient patient = patientDTO.createEntity();
		patientRepository.save(patient);
	
		
	}
	
	
	public void saveVitalParam(Long id , PatientVitalParamDTO patientVitalParamDTO) 
	{
		logger.info("Creation request for patient {} with data {}" , id , patientVitalParamDTO);
		patientVitalParamDTO.setPatientId(id);
		PatientVitalParam patientVitalParam = patientVitalParamDTO.create();
		
		Patient p = patientRepository.getOne(id);
		p.getVitalParam().add(patientVitalParam);
		p.setVitalParam(p.getVitalParam());
		patientRepository.save(p);
		
		
	}

	@Override
	public PatientDTO getById(Long id) {
		logger.info("GET request for patient {} with data {}" , id);
		Patient patient = patientRepository.findById(id).get();
		PatientDTO patientDTO = PatientDTO.valueOF(patient);
		logger.info(" Value for patient {} " , patientDTO);
		return patientDTO;
		
	}

	@Override
	public PatientDTO delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientDTO update(PatientDTO c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientDTO getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
