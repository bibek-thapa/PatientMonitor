package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.VitalParam;

public interface VitalRepository extends JpaRepository<VitalParam, Long>{

}
