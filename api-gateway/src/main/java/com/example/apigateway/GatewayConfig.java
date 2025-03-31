package com.example.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes().route("service-a", r -> r.path("/service-a/**").uri("lb://SERVICE-A"))
				.route("service-b", r -> r.path("/service-b/**").uri("lb://SERVICE-B")).build();
	}
}