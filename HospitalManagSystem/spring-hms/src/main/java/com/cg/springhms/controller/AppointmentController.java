package com.cg.springhms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.springhms.entity.Appointment;
import com.cg.springhms.entity.Patient;
import com.cg.springhms.service.AppointmentService;


@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping("/fetch")
	   public List<Appointment> fetch() {
		   
		   return appointmentService.getList();
	   }
	 
	 @PostMapping("/create")
	   public String create(@RequestBody Appointment appointment) {
		 appointmentService.save( appointment);
		   return "Record Added Successfully";
	   }
	 
	/*
	 * @GetMapping(value = "/update/{name}") public List<Appointment> update(String
	 * name) { return appointmentService.update(name);
	 * 
	 * }
	 */
	

}
