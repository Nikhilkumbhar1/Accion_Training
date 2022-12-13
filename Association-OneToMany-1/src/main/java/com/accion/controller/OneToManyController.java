package com.accion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.accion.entity.Person;
import com.accion.service.PersonMgmt;

@RestController
public class OneToManyController {

	@Autowired
	private PersonMgmt service;
   //Add Person Details
	@PostMapping("/addDetails")
	public ResponseEntity<String> addingPersonAndPhoneDetails(@RequestBody Person person){

		try {
			String msg = service.saveDataUsingParent(person);
			return new ResponseEntity<>(msg,HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	//Update Person Details
	@PutMapping("/updateDetails")
	public ResponseEntity<String> updatePersonAndPhoneDetails(@RequestBody Person person){

		try {
			String msg = service.UpdateDataUsingParent(person);
			return new ResponseEntity<>(msg,HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}

}
