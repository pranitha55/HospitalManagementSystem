package com.cg.springhms.service;

import java.time.LocalDateTime;
import java.util.List;

import com.cg.springhms.entity.Doctor;
import com.cg.springhms.entity.Slot;


public interface DoctorService {
	
	public List<Doctor> findAll();
	
	
	
	public String save(Doctor doctor);
	
	public String removeDoctor(Long doctorId);
	
	public Doctor updateDoctor(Doctor doctor);
	
	
	
	/*
	 * List<Slot> findByStartTimeAndEndTime(LocalDateTime startTime, LocalDateTime
	 * endTime);
	 */
	 
	

	

}
