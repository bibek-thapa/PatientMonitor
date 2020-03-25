package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.VitalParam;
import com.example.repository.VitalRepository;
import com.example.service.VitalParamService;

@Service
public class VitalParamServiceImpl implements VitalParamService{

	@Autowired
	private VitalRepository vitalRepository;

	@Override
	public List<VitalParam> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(VitalParam c) {
		// TODO Auto-generated method stub
		
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
	
	

}
