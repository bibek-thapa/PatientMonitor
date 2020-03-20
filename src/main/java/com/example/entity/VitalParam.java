package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "vitalparam_tbl")
public class VitalParam {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	
	



}
