package com.cg.springhms.service;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.springhms.entity.Doctor;


public interface DoctorService {
	
	public List<Doctor> findAll();
	
	
	
	public String save(Doctor admin);
	
	public String removeDoctor(Long id);
	
	public Doctor updateDoctor(Doctor doctor);
	
	/* public void allocateSlots(LocalDateTime startTime, LocalDateTime endTime); */
	 
	

	

}
