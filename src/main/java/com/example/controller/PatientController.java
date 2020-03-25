package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.PatientDTO;
import com.example.dto.PatientVitalParamDTO;
import com.example.entity.Patient;
import com.example.serviceimpl.PatientServiceImpl;

@RestController

public class PatientController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass()); 

	
	@Autowired
	PatientServiceImpl patientService;

	
	@PostMapping(path = "/patient",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertData(@RequestBody PatientDTO patientDTO) 
	{
		
	logger.info("Creation request for patient {}",patientDTO);	
	 patientService.insert(patientDTO);
	}
	
	
	@GetMapping(path="/patient/{id}")
	public PatientDTO getCustomerProfile(@PathVariable Long id) 
	{
		logger.info("Request for patient {}", id);	
		return patientService.getById(id);
		
	}
	
	@PostMapping(value="/patient/{id}/vitalparams",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveVitalParam(@PathVariable Long id, @RequestBody PatientVitalParamDTO patientVitalParamDTO)
	{
		logger.info("Creation Request for patient {} with data{}", id , patientVitalParamDTO);
		patientService.saveVitalParam(id, patientVitalParamDTO);

		
	}
	

}
