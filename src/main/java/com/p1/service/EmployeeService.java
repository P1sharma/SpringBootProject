package com.p1.service;

import java.util.List;

import com.p1.model.Employee;

public interface EmployeeService {
	
	public void saveUser(Employee user);

	public List<Employee> showalluser();

	public Iterable<Employee> deleteByUserName(String uname);

	public Employee findByUserName(String userName);

}
