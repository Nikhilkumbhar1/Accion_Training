package com.accion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accion.entity.PhoneNumber;

public interface PhoneNumberRepo extends JpaRepository<PhoneNumber,Integer>{

}
