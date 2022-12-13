package com.accion.exception;

public class PersonNotFoundException extends RuntimeException {

	public PersonNotFoundException() {
		super();
	}
	public PersonNotFoundException(String msg) {
		super(msg);
	}

}
