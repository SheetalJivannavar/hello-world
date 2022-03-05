package com.webservice.skillhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class Controller {
@GetMapping	
public String getMethod() {
	//added a comment
	return "Hello World!  this is my first project";
	
	
}
}
