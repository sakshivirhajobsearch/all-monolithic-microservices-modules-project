package com.example.resilience;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resilient")
public class ResilientController {
	@GetMapping
	public String testResilience() {
		return "Resilience4j is working!";
	}
}
