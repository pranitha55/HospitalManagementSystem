package com.cg.springhms.repository;


import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.springhms.entity.Slot;

@Repository
public interface SlotRepo extends CrudRepository<Slot, Long>{



	List<Slot> findByStartTimeAndEndTime(LocalDateTime startTime, LocalDateTime endTime);
	
	
}
