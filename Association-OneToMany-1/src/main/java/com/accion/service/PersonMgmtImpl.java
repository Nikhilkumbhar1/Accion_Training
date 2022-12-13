package com.accion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accion.entity.Person;
import com.accion.repository.PersonRepo;
import com.accion.repository.PhoneNumberRepo;

@Service
public class PersonMgmtImpl implements PersonMgmt {

	@Autowired
	private PersonRepo prepo;

    @Override
	public String saveDataUsingParent(Person person) {
    	System.out.println(person);
           prepo.save(person);
    	return "Person Details are Saved";
    }
}
