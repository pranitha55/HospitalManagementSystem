package com.cg.springhms.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springhms.entity.Slot;
import com.cg.springhms.repository.SlotRepo;

@Service
public class SlotServiceImple implements SlotService {
	
	@Autowired
	public SlotRepo slotRepo;

	@Override
	public List<Slot> findByStartTimeAndEndTime(LocalDateTime startTime, LocalDateTime endTime) {
		// TODO Auto-generated method stub
		return slotRepo.findByStartTimeAndEndTime(startTime, endTime);
	}
	

}
