package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.VitalParam;
import com.example.serviceimpl.VitalServiceImpl;

@CrossOrigin(origins ="http://localhost:4200",maxAge=3000)
@RestController
public class VitalParamController {

	@Autowired
	VitalServiceImpl VitalParamService;
	
	@PostMapping("/patient/{patientId}/vitalparams")
	public VitalParam createVitalParam(@PathVariable("patientId")Long patientId, @RequestBody VitalParam vitalParam )
	{
		return VitalParamService.saveVital(patientId, vitalParam);
		
	}
	
	@GetMapping("/patient/{patientId}/vitalparams")
	public Page<VitalParam> getAllVitalByPatientId(@PathVariable("patientId")Long patientId, Pageable pageable)
	{
		
		return VitalParamService.getAllVitalParamByPatient(patientId, pageable);
	}
	
}
