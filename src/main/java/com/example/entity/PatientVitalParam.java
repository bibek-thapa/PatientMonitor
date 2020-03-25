package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patientvitalparam")
public class PatientVitalParam {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	@Column(name= " patient_id")
	Long patientId;
	
	@Column(name="vitalparam_id")
	Long vitalParamId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public Long getVitalParamId() {
		return vitalParamId;
	}

	public void setVitalParamId(Long vitalParamId) {
		this.vitalParamId = vitalParamId;
	}
	
	
	

}
