package com.cg.springhms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springhms.entity.Appointment;


@Repository("appointmentRepo")
public interface AppointmentRepo extends JpaRepository<Appointment, Long> {

}
