package com.cg.springhms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springhms.entity.Patient;
import com.cg.springhms.service.PatientService;


@RestController
public class PatientController {
	
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/patients")
	public List<Patient> allPatients() {
		return patientService.findAll();
	}
	
	@DeleteMapping("/patientById/{id}")
	public String deletePatient(@PathVariable Long id) {
		patientService.deletePatient(id);
		return "patient deleted + id";
	}
	
	@PostMapping("/addPatient")
	   public String addPatient(@RequestBody Patient patient) {
		patientService.save(patient);
		   return "Record Added Successfully";
	   }
	
	@PutMapping("/updatePatient")
	 public Patient update(@RequestBody Patient patient) {
		patientService.save(patient);
		 return patient;
	 }

}
