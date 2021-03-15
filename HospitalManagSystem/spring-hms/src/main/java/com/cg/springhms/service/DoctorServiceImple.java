package com.cg.springhms.service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springhms.entity.Doctor;
import com.cg.springhms.entity.Patient;
import com.cg.springhms.repository.DoctorRepo;


@Service
public class DoctorServiceImple implements DoctorService {
	
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public String save(Doctor admin) {
		doctorRepo.save(admin);
		return "Admin added successfully";
		
		
	}

	@Override
	public String removeDoctor(Long id) {
		doctorRepo.deleteById(id);
		return "Doctor with Id" + id +"deleted Successfully";
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

	
	

}
