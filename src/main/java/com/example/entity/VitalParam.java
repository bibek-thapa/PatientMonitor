package com.example.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "vitalparam_tbl")
public class VitalParam implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "viatalparam_id")
	private Long id;
	
	@Column
	private Integer temperature;
	
	@Column 
	private Integer heartRate;
	
	@Column 
	private Integer bloodPressureHigh;
	
	@Column 
	private Integer bloodPressureLow;
	
	@Column 
	private Integer respiratoryRate;
	
	@Column 
	private Date date;
	
	

	public VitalParam() {
		super();
	}

	public VitalParam(Integer temperature, Integer heartRate, Integer bloodPressureHigh, Integer bloodPressureLow,
			Integer respiratoryRate, Date date) {
		super();
		this.temperature = temperature;
		this.heartRate = heartRate;
		this.bloodPressureHigh = bloodPressureHigh;
		this.bloodPressureLow = bloodPressureLow;
		this.respiratoryRate = respiratoryRate;
		this.date = date;
	}

	@Override
	public String toString() {
		return "VitalParam [temperature=" + temperature + ", heartRate=" + heartRate + ", bloodPressureHigh="
				+ bloodPressureHigh + ", bloodPressureLow=" + bloodPressureLow + ", respriatoryRate=" + respiratoryRate
				+ ", date=" + date + "]";
	}

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
	
	
	



}
