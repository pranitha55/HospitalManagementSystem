package com.cg.springhms.service;

import java.util.List;

import com.cg.springhms.entity.Patient;



public interface PatientService {
	
	
	public List<Patient> findAll();
	
	public String save(Patient patient);
	
	String deletePatient(Long id);
	
	Patient updatePatient(Patient patient);

}
