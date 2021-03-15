package com.cg.springhms.entity;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="patient_id")
	private Long patientId;
	private String name;
	private Long contactNo;
	private String height;
	private int weight;
	private String bloodGroup;
	private String gender;
	
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy="patient")
	private List<Doctor> doctor;
	

	public List<Doctor> getDoctor() {
		return doctor;
	}

	public Patient setDoctor(List<Doctor> doctor) {
		this.doctor = doctor;
		doctor.forEach(entity -> entity.setPatient(this));
		return this;
	}
	
	

	public Long getPatientId() {
		return patientId;
	}

	public Patient setPatientId(Long patientId) {
		this.patientId = patientId;
		return this;
	}

	public String getName() {
		return name;
	}

	public Patient setName(String name) {
		this.name = name;
		return this;
	}

	public Long getContactNo() {
		return contactNo;
	}

	public Patient setContactNo(Long contactNo) {
		this.contactNo = contactNo;
		return this;
	}

	public String getHeight() {
		return height;
	}

	public Patient setHeight(String height) {
		this.height = height;
		return this;
	}

	public int getWeight() {
		return weight;
	}

	public Patient setWeight(int weight) {
		this.weight = weight;
		return this;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public Patient setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public Patient setGender(String gender) {
		this.gender = gender;
		return this;
	}

	
	

}
