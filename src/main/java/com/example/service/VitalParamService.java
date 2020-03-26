package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.entity.VitalParam;

public interface VitalParamService extends GenericService<VitalParam>{
	
	public VitalParam saveVital(Long id, VitalParam vitalParam);
	public Page<VitalParam> getAllVitalParamByPatient(Long patientId, Pageable pageable);

}
