package com.accion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accion.entity.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}
