package com.cg.springhms.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cg.springhms.entity.Slot;

public interface SlotService {
	


	List<Slot> findByStartTimeAndEndTime(LocalDateTime startTime, LocalDateTime endTime);

}
