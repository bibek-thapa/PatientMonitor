package com.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.VitalParam;

public interface VitalRepository extends JpaRepository<VitalParam, Long>{
	
	Page<VitalParam> findByPatientId(Long patientId,Pageable pageable);

}
