package com.hyungmok.springboot.cruddemo.service;

import java.util.List;

import com.hyungmok.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theID);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
