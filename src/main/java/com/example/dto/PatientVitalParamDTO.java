package com.example.dto;

import com.example.entity.PatientVitalParam;

public class PatientVitalParamDTO {
	
	Long patientId;
	Long vitalPararmId;
	
	public Long getPatientId() {
		return patientId;
	}
	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}
	public Long getVitalPararmId() {
		return vitalPararmId;
	}
	public void setVitalPararmId(Long vitalPararmId) {
		this.vitalPararmId = vitalPararmId;
	}
	public PatientVitalParamDTO(Long patientId, Long vitalPararmId) {
		super();
		this.patientId = patientId;
		this.vitalPararmId = vitalPararmId;
	}
	public PatientVitalParamDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public PatientVitalParam create() 
	{
		PatientVitalParam patientVitalParam = new PatientVitalParam();
		patientVitalParam.setPatientId(this.getPatientId());
		patientVitalParam.setVitalParamId(this.getVitalPararmId());
		
		return patientVitalParam;
		
	}
	@Override
	public String toString() {
		return "PatientVitalParamDTO [patientId=" + patientId + ", vitalPararmId=" + vitalPararmId + "]";
	}
	
	

}
