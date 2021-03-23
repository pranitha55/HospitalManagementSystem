package com.cg.springhms.repository;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springhms.entity.Doctor;
import com.cg.springhms.entity.Slot;


@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {

	
	
	

}
