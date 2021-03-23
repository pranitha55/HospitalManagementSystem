package com.cg.springhms.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.springhms.entity.Slot;
import com.cg.springhms.service.SlotService;

@Controller
public class SlotController {
	
	@Autowired
	private SlotService slotService;
	
	
	@GetMapping("/date")
	public List<Slot> findByDateSortedBy(@DateTimeFormat(iso
			  = DateTimeFormat.ISO.DATE) @RequestParam("startTime") LocalDateTime
			  startTime, @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam("endTime")
			  LocalDateTime endTime) {
		return slotService.findByStartTimeAndEndTime(startTime, endTime);
		}
			 

}
