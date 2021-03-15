package com.cg.springhms.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.springhms.entity.Doctor;


@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Long> {
	
	
	

}
