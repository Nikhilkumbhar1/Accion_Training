package com.accion.service;

import java.util.List;

import com.accion.entity.Employee;

public interface EmployeeService {
	
	public String addEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	public String deleteEmployee(Integer empId);
	
	public Employee getEmployeeById(int id);
	
	/*
	 * public List<Employee> fetchEmployeeByLocation(String location1,String
	 * location2);
	 */
	
	public String updateEmployee(Employee employee);
	
	public String deleteEmployeeById(Integer empId);

}
