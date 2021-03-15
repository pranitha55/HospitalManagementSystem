package com.cg.springhms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springhms.entity.Doctor;
import com.cg.springhms.service.DoctorService;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	 @GetMapping("/findAll")
	   public List<Doctor> getAllList() {
		   
		   return doctorService.findAll();
	   }
	 
	 @PostMapping("/add")
	   public String addDoctor(@RequestBody Doctor doctor) {
		 doctorService.save(doctor);
		   return "Record Added Successfully";
	   }
	
	 
	 @DeleteMapping("/doctors/{id}")
	 public String delete(@PathVariable Long id) {
		 doctorService.removeDoctor(id);
		 return "deleted successfully";
	 }
	 
	 @PutMapping("/doctor")
	 public Doctor update(@RequestBody Doctor doctorObj) {
		 doctorService.save(doctorObj);
		 return doctorObj;
	 }
	 
	/*
	 * @DeleteMapping("/doctor/{id}") public String removeById(@PathVariable long
	 * id) { doctorService.removeDoctor(id); return "Doctor deleted Successfully";
	 * 
	 * }
	 * 
	 * @PutMapping("/update") public Doctor updateEmployee(@RequestBody Doctor
	 * doctor) {
	 * 
	 * return doctorService.updateDoctor(doctor);
	 * 
	 * }
	 * 
	 * 
	 */


}
