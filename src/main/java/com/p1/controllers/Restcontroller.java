package com.p1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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

}
