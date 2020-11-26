package com.p1.controllers;

import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.p1.model.Employee;
import com.p1.service.EmployeeService;

@RestController
public class Restcontroller {

	@Autowired
	private EmployeeService service;

	RestTemplate restTemplate = new RestTemplate();

	@CrossOrigin
	@ResponseBody
	@PostMapping(value = "/save-user")
	public String registerUser(@RequestBody Employee user) {
		service.saveUser(user);
		return "Hello " + user.getFirstname() + " your registration is succesfully";
	}

	@CrossOrigin
	@GetMapping(value = "/showall")
	public List<Employee> showalluser() {
		return service.showalluser();
	}

	@CrossOrigin
	@DeleteMapping(value = "/deleteuser/{userName}")
	@Transactional
	public Iterable<Employee> deleteUser(@PathVariable String userName) {
		return service.deleteByUserName(userName);
	}

	@CrossOrigin
	@GetMapping(value = "/find/{userName}")
	public Employee findUser(@PathVariable String userName) {
		return service.findByUserName(userName);
	}

	@RequestMapping(value = "/template/employeedetails")
	public String getProductList() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<String>(headers);

		return restTemplate.exchange("http://localhost:8081/emp/otherDetails", HttpMethod.GET, entity, String.class).getBody();
	}
}
