package com.cg.springhms.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springhms.entity.Patient;
import com.cg.springhms.repository.PatientRepo;

@Service
public class PatientServiceImple implements PatientService {
	
	@Autowired
	private PatientRepo patientRepo;

	
	@Override
	public List<Patient> findAll() {
		
		return patientRepo.findAll();
	}

	@Override
	public String save(Patient patient) {
		patientRepo.save(patient);
		return "patient added";
	}

	@Override
	public String deletePatient(Long id) {
		patientRepo.deleteById(id);
		return "patient deleted!!";
	}

	@Override
	public Patient updatePatient(Patient patient) {
		
		return patientRepo.save(patient);
	}
	
	

}
