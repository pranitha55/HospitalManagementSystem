package com.cg.springhms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springhms.entity.Patient;


@Repository("userRepo")
public interface PatientRepo extends JpaRepository<Patient, Long> {
	
	
	List<Patient> findAll();

}
