package com.hyungmok.springboot.cruddemo.dao;

import java.util.List;

import com.hyungmok.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {
	public List<Employee> findAll();
}
