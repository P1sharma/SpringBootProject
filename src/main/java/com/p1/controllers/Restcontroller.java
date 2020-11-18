package com.p1.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.p1.modal.User;
import com.p1.service.UserService;

@RestController
public class Restcontroller {

	@Autowired
	private UserService service;
	
	public Restcontroller() {}
	
	public Restcontroller(UserService service) {
		super();
		this.service = service;
	}

	@ResponseBody
	@PostMapping(value = "/save-user")
	public String registerUser(@RequestBody User user) {
		service.saveUser(user);
		return "Hello "+user.getFirstName()+" your registration is succesfully";
	}
	
	@GetMapping(value = "/showall")
	public List<User> showalluser() {
		return service.showalluser();
	}
	 
	@DeleteMapping(value = "/deleteuser/{userName}")
	@Transactional
	public Iterable<User> deleteUser(@PathVariable String userName) {
		return service.deleteByUserName(userName);
	}

	@GetMapping(value = "/find/{userName}")
	public User findUser(@PathVariable String userName) {
		return service.findByUserName(userName);
	}
}
