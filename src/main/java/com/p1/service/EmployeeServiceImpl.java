package com.p1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.p1.modal.Employee;
import com.p1.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository repo;


	public void saveUser(Employee emp) {

		repo.save(emp);
	}

	@Override
	public List<Employee> showalluser() {
		// TODO Auto-generated method stub
		return (List<Employee>) repo.findAll();
	}

	@Override
	public Iterable<Employee> deleteByUserName(String uname) {
		 repo.deleteByusername(uname);
		 return repo.findAll();
	}

	@Override
	public Employee findByUserName(String userName) {
		// TODO Auto-generated method stub
		return repo.findByusername(userName);
	}

}
