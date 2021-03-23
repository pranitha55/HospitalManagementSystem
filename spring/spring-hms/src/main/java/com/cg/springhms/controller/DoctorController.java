package com.cg.springhms.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springhms.entity.Doctor;
import com.cg.springhms.entity.Slot;
import com.cg.springhms.exception.ObjectNotFoundException;
import com.cg.springhms.service.DoctorService;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	Logger logger = LoggerFactory.getLogger(DoctorController.class);
	
	 @GetMapping("/findAll")
	   public ResponseEntity<List<Doctor>> getAllList() {
		   
		 List<Doctor> doctorsList = doctorService.findAll();
		 logger.info("returned the doctor list");
		 return new ResponseEntity<List<Doctor>>(doctorsList, HttpStatus.OK);
	   }
	 
	 @PostMapping("/add")
	   public ResponseEntity<String> addDoctor(@RequestBody Doctor doctor) 
			   throws ObjectNotFoundException {
		/*
		 * String tempName = doctor.getName(); Long tempContactNo =
		 * doctor.getContactNo();
		 */
		 try {
		 doctorService.save(doctor);
		 return new ResponseEntity<String>("doctor added successfully", HttpStatus.OK);
		 } catch(DataIntegrityViolationException e) {
			 throw new  ObjectNotFoundException("Doctor does not exists");
		 }
	   }
	
	 
	 @DeleteMapping("/doctors/{doctorId}")
	 public ResponseEntity<String> delete(@PathVariable Long doctorId) throws ObjectNotFoundException {
		 try {
		 doctorService.removeDoctor(doctorId);
		 return new ResponseEntity<String>("doctor deleted successfully", HttpStatus.OK);
		 } catch(DataIntegrityViolationException e) {
			 throw new  ObjectNotFoundException("Doctor id not exists");
		 }
		
	 }
	 
	 @PutMapping("/doctor")
	 public Doctor update(@RequestBody Doctor doctorObj) {
		 doctorService.save(doctorObj);
		 return doctorObj;
	 }
	 
	/*
	 * @GetMapping("/date") public List<Slot> findByDateSortedBy(@DateTimeFormat(iso
	 * = DateTimeFormat.ISO.DATE) @RequestParam("startTime") LocalDateTime
	 * startTime,
	 * 
	 * @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("endTime")
	 * LocalDateTime endTime) { return doctorService.allocateSlots(startTime,
	 * endTime); }
	 */

}
