package com.example.dto;

import java.util.Date;

import com.example.entity.VitalParam;

public class VitalParamDTO {
	

	private Long id;
	
	
	private Integer temperature;
	
	
	private Integer heartRate;
	
	
	private Integer bloodPressureHigh;
	
	
	private Integer bloodPressureLow;
	
	
	private Integer respiratoryRate;
	
	
	private Date date;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Integer getTemperature() {
		return temperature;
	}


	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}


	public Integer getHeartRate() {
		return heartRate;
	}


	public void setHeartRate(Integer heartRate) {
		this.heartRate = heartRate;
	}


	public Integer getBloodPressureHigh() {
		return bloodPressureHigh;
	}


	public void setBloodPressureHigh(Integer bloodPressureHigh) {
		this.bloodPressureHigh = bloodPressureHigh;
	}


	public Integer getBloodPressureLow() {
		return bloodPressureLow;
	}


	public void setBloodPressureLow(Integer bloodPressureLow) {
		this.bloodPressureLow = bloodPressureLow;
	}


	public Integer getRespiratoryRate() {
		return respiratoryRate;
	}


	public void setRespiratoryRate(Integer respiratoryRate) {
		this.respiratoryRate = respiratoryRate;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public String toString() {
		return "VitalParamDTO [id=" + id + ", temperature=" + temperature + ", heartRate=" + heartRate
				+ ", bloodPressureHigh=" + bloodPressureHigh + ", bloodPressureLow=" + bloodPressureLow
				+ ", respiratoryRate=" + respiratoryRate + ", date=" + date + "]";
	}
	
	public static VitalParamDTO valueOf(VitalParam vitalParam) 
	{
		VitalParamDTO vitalParamDTO = new VitalParamDTO();
		vitalParamDTO.setId(vitalParam.getId());
		vitalParamDTO.setBloodPressureHigh(vitalParam.getBloodPressureHigh());
		vitalParamDTO.setBloodPressureLow(vitalParam.getBloodPressureLow());
		vitalParamDTO.setHeartRate(vitalParam.getHeartRate());
		vitalParamDTO.setRespiratoryRate(vitalParam.getRespiratoryRate());
		vitalParamDTO.setTemperature(vitalParam.getTemperature());
		
		return vitalParamDTO;
		
		
		
	}

}
