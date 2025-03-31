package com.example.serviceA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
	@GetMapping("/message")
	public String getMessage() {
		return "Hello from Service A!";
	}
}