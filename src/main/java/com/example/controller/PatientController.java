package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Patient;
import com.example.entity.VitalParam;
import com.example.scheduledtask.PostSchedule;
import com.example.serviceimpl.PatientServiceImpl;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	private static final Logger logger = LoggerFactory.getLogger(PostSchedule.class);

	@Autowired
	PatientServiceImpl patientService;

	@PostMapping(path = "/insert")
	public Patient insertData(@RequestBody Patient patient) 
	{
		
		
		return patientService.insert(patient);
	}
	
	@GetMapping(path = "/{id}",produces = "application/json")
	public Patient getPatientData(@PathVariable("id")Long id) 
	{
		return patientService.getById(id);
	}


}
