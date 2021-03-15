package com.cg.springhms.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springhms.entity.Appointment;
import com.cg.springhms.entity.Patient;
import com.cg.springhms.repository.AppointmentRepo;


@Service("appointmentService")
public class AppointmentServiceImple implements AppointmentService {
	
	@Autowired
	private AppointmentRepo appointmentRepo;

	@Override
	public List<Appointment> getList() {
		return appointmentRepo.findAll();
	}

	@Override
	public String save(Appointment appointment) {
		appointmentRepo.save( appointment);
		return "added successfully";
	}

	/*
	 * @Override public List<Appointment> update(String name) { Appointment
	 * appointment = new Appointment();
	 * 
	 * Patient patient = new Patient(); patient.setGender("female")
	 * .setBloodGroup("o+") .setContactNo(9876543275l) .setHeight("5'4")
	 * .setWeight(55) .setName(name);
	 * 
	 * appointment.setEmail("pranitha@gmail.com") .setDescription("fever")
	 * .setName("prani") .setPatient(patient);
	 * 
	 * appointmentRepo.save(appointment);
	 * 
	 * return appointmentRepo.findAll();
	 * 
	 * }
	 */
	
	

}
