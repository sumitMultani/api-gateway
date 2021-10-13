package com.gainjavaknowledge.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/storeFallback")
	public String storeServiceFallbackMethod() {
		return "store service is longer than expected. Please try again later.";
	}
	
	@GetMapping("/catalogFallback")
	public String catalogServiceFallbackMethod() {
		return "catalog service is longer than expected. Please try again later.";
	}
}
