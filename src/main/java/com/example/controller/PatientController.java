package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Patient;
import com.example.serviceimpl.PatientServiceImpl;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientServiceImpl patientService;

	@PostMapping(path = "/insert")
	public String insertData() 
	{
		Patient patient = new Patient();
		patient.setFirstName("Ram");
		patient.setLastName("Karki");
		patient.setEmail("ramkarki@gmail.com");
		
		return patientService.insert(patient).toString();
	}
	
	@GetMapping(path = "/{id}",produces = "application/json")
	public String getPatientData(@PathVariable("id")Long id) 
	{
		return patientService.getById(id).toString();
	}


}
