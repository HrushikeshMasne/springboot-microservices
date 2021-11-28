package com.hruhikesh.microservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackMethodController {
	
	@GetMapping("/callUserFallbackMethod")
	public String userFallBackMethod() {
		return "User service failed ! Please check the logs for more information.";
	}
	
	@GetMapping("/callDepartmentFallbackMethod")
	public String departmentFallBackMethod() {
		return "Department service failed ! Please check the logs for more information.";
	}
}
