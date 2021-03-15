package com.cg.springhms.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "appointment")
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "appointment_id")
	private Long appointmentId;
	private String name;
	private String email;
	private Date date;
	private String description;

	
	  @ManyToOne 
	  @JoinColumn(name = "doctor_id") 
	  private Doctor doctor; 
	  
	  @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "patient_id", referencedColumnName = "patient_id")
		private Patient patient;
		
	

	public Appointment() {

	}
	
	
	
	public Patient getPatient() {
		return patient;
	}



	public Appointment setPatient(Patient patient) {
		this.patient = patient;
		return this;
	}



	public Long getAppointmentId() {
		return appointmentId;
	}


	public Appointment setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
		return this;
	}
	
	
	public Doctor getDoctor() {
		return doctor;
	}


	public Appointment setDoctor(Doctor doctor) {
		this.doctor = doctor;
		return this;
	}



	public String getName() {
		return name;
	}

	public Appointment setName(String name) {
		this.name = name;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public Appointment setEmail(String email) {
		this.email = email;
		return this;
	}

	public Date getDate() {
		return date;
	}

	public Appointment setDate(Date date) {
		this.date = date;
		return this;
	}


	public String getDescription() {
		return description;
	}

	public Appointment setDescription(String description) {
		this.description = description;
		return this;
	}


}
