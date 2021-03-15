package com.cg.springhms.service;

import java.util.List;

import com.cg.springhms.entity.Appointment;


public interface AppointmentService {
	
	public List<Appointment> getList();
	
	public String save(Appointment appointment);
	
	/* public List<Appointment> update(String name); */

}
