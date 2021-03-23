package com.cg.springhms.exception;

public class ErrorInfo extends RuntimeException {
	
	private String message;
	
	public ErrorInfo() {
		super();
	}
	
	
	
	public  ErrorInfo(String message ) {
		super(message);
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
