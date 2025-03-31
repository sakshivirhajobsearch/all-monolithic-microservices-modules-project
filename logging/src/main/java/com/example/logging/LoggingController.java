package com.example.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/logs")
public class LoggingController {

	private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

	@GetMapping
	public String logMessage() {
		logger.info("GET request received at /api/logs");
		return "Logging API is working!";
	}

	@PostMapping
	public String logCustomMessage(@RequestBody String message) {
		logger.info("Custom log message received: {}", message);
		return "Logged: " + message;
	}
}