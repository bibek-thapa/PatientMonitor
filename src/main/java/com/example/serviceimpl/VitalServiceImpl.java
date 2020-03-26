package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.entity.Patient;
import com.example.entity.VitalParam;
import com.example.repository.PatientRepository;
import com.example.repository.VitalRepository;
import com.example.service.VitalParamService;

@Service
public class VitalServiceImpl implements VitalParamService{
	
	@Autowired
	private VitalRepository vitalRepository;
	
	@Autowired
	private PatientRepository patientRepository;
	

	@Override
	public List<VitalParam> getAll() {
		return null;
	}

	@Override
	public VitalParam insert(VitalParam vitalParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VitalParam getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VitalParam delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VitalParam update(VitalParam c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VitalParam getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public VitalParam saveVital(Long id, VitalParam vitalParam) {
		
		Patient p = patientRepository.getOne(id);
		vitalParam.setPatient(p);
		return vitalRepository.save(vitalParam);
		
	}

	@Override
	public Page<VitalParam> getAllVitalParamByPatient(Long patientId, Pageable pageable) {
		return vitalRepository.findByPatientId(patientId, pageable);
	}

}
