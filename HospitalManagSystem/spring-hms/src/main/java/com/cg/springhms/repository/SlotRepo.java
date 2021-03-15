package com.cg.springhms.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.springhms.entity.Slot;


public interface SlotRepo extends JpaRepository<Slot, Long>{
	

}
