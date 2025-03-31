package com.example.eventdriven;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@GetMapping("/send")
	public ResponseEntity<String> sendMessage(@RequestParam String message) {
		kafkaTemplate.send("your-topic-name", message);
		return ResponseEntity.ok("Message sent to Kafka");
	}
}
