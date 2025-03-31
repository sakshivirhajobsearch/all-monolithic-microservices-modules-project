package com.example.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigurationManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigurationManagementApplication.class, args);
	}
}