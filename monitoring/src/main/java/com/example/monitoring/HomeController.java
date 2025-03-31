package com.example.monitoring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class HomeController {
	@GetMapping
	public String home() {
		return "Welcome to the Monitoring Service!";
	}
}
