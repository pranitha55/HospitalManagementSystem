package com.cg.springhms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springhms.entity.Doctor;
import com.cg.springhms.entity.Patient;
import com.cg.springhms.exception.ObjectNotFoundException;
import com.cg.springhms.service.PatientService;


@RestController
public class PatientController {
	
	
	@Autowired
	private PatientService patientService;
	
	Logger logger = LoggerFactory.getLogger(PatientController.class);
	
	@GetMapping("/patients")
	public ResponseEntity<List<Patient>> allPatients() {
		List<Patient> patientsList =  patientService.findAll();
		 logger.info("return the patient list");
		 return new ResponseEntity<List<Patient>>(patientsList, HttpStatus.OK);
	}
	
	@DeleteMapping("/patientById/{id}")
	public ResponseEntity<String> deletePatient(@PathVariable Long id) throws ObjectNotFoundException {
		 try {
		patientService.deletePatient(id);
		 return new ResponseEntity<String>("patient deleted successfully", HttpStatus.OK);
		 } catch(DataIntegrityViolationException e) {
			 throw new  ObjectNotFoundException("patient id not exists");
		 }
		
		
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
