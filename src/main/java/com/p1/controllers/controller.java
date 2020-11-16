package com.p1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controller {

	@ResponseBody
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home() {
		return "Welcome to the Spring-Boot Project";
	}
}
