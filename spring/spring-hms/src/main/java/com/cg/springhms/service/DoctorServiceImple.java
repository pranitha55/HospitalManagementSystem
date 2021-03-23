package com.cg.springhms.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springhms.entity.Doctor;
import com.cg.springhms.entity.Patient;
import com.cg.springhms.entity.Slot;
import com.cg.springhms.repository.DoctorRepo;


@Service
public class DoctorServiceImple implements DoctorService {
	
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public String save(Doctor doctor) {
		
		/* Optional<String> findSlotById = doctorRepo.findById(admin.get) */
		doctorRepo.save(doctor);
		return "Admin added successfully";
		
		
	}

	@Override
	public String removeDoctor(Long doctorId) {
		doctorRepo.deleteById(doctorId);
		return "Doctor with Id" + doctorId +"deleted Successfully";
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return doctorRepo.save(doctor);
	}

	@Override
	public List<Doctor> findAll() {
		List<Doctor> it= doctorRepo.findAll();
		List<Doctor> doctorsList=new ArrayList<Doctor>();
		it.forEach(e -> doctorsList.add(e));
		return doctorsList;
	}

	
	/*
	 * @Override public List<Slot> findByStartTimeAndEndTime(LocalDateTime
	 * startTime, LocalDateTime endTime) { return
	 * doctorRepo.findByStartTimeAndEndTime(startTime, endTime); }
	 */
	 

	
	

}
