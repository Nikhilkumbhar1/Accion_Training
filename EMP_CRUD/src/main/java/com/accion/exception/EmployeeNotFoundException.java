package com.accion.exception;

public class EmployeeNotFoundException extends RuntimeException {
	public EmployeeNotFoundException(){
		super();
	}
	public EmployeeNotFoundException(String msg){
		super(msg);
	}
	

}
