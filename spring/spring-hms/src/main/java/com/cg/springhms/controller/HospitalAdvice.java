package com.cg.springhms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cg.springhms.exception.ErrorInfo;
import com.cg.springhms.exception.ObjectNotFoundException;

public class HospitalAdvice {
	
	@ExceptionHandler(value = {ObjectNotFoundException.class})
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public ErrorInfo handleException(Exception e) {
		return new ErrorInfo(e.getMessage());
	}

}
