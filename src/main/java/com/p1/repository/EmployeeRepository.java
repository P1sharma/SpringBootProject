package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.p1.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	public Iterable<Employee> deleteByusername(String userName);
	
	public Employee findByusername(String userName);

}
