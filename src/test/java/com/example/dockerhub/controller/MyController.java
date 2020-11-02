package com.example.dockerhub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping()
public class MyController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello, World";
	}
	
}
