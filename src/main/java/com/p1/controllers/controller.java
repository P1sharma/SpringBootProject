package com.p1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

	@ResponseBody
	@GetMapping(value = "/home")
	public String home() {
		return "Welcome to the Spring-Boot Project";
	}
	
	@ResponseBody
	@GetMapping(value = "/welcome")
	public String welcome() {
		
		return "Welcome to the Spring boot application";
	}
}
