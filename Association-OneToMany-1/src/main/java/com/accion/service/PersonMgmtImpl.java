package com.accion.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accion.entity.Person;
import com.accion.exception.PersonNotFoundException;
import com.accion.repository.PersonRepo;

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
    //Update Person Details
    @Override
    public String UpdateDataUsingParent(Person person) {
		Optional<Person> per = prepo.findById(person.getpId());
		if(per.isPresent()) {
			prepo.save(person);
			return person.getpId()+" Person Details are updated Succefully..";
		}
		else {
			throw new PersonNotFoundException("Person not Found to Update");
		}
	}
}
