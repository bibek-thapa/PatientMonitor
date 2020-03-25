package com.example.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.entity.Patient;
import com.example.entity.PatientVitalParam;

public class PatientDTO {

	Long id;

	private String firstName;

	private String lastName;

	private String email;

	private List<Long> vitalParam;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Long> getVitalParam() {
		return vitalParam;
	}

	public void setVitalParam(List<Long> vitalParam) {
		this.vitalParam = vitalParam;
	}

	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", vitalParam=" + vitalParam + "]";
	}

	public static PatientDTO valueOF(Patient patient) {
		PatientDTO patientDTO = new PatientDTO();
		patientDTO.setId(patient.getId());
		patientDTO.setFirstName(patient.getFirstName());
		patientDTO.setLastName(patient.getLastName());
		patientDTO.setEmail(patient.getEmail());

		List<PatientVitalParam> vitalParams = patient.getVitalParam();
		List<Long> vitalParamList = new ArrayList<>();
		for (PatientVitalParam vP : vitalParams) {
			vitalParamList.add(vP.getVitalParamId());
		}

		patientDTO.setVitalParam(vitalParamList);

		return patientDTO;

	}

	public Patient createEntity()
	
	{
		Patient patient = new Patient();
		patient.setId(this.getId());
		patient.setFirstName(this.getFirstName());
		patient.setLastName(this.getLastName());
		patient.setEmail(this.getEmail());

	return patient;
		
	}	
}
