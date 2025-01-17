package com.bowmen.group.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthController {
	
	
	@GetMapping("health")
	public ResponseEntity<?> getHealthCheck() {
		
		return new ResponseEntity<String>("I am healthy", HttpStatus.OK);
	}
	

}
