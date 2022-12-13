package com.accion.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accion.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Serializable> {
	
	/*
	 * @Query("from EMPLOYEE where emp_location in (l1:l2) order by location")
	 * public List<Employee> getEmployeeByLocation(@Param("l1") String
	 * location1,@Param("l2") String location);
	 */}
