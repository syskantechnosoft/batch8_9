package com.cts.securitydemoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring Security";
	}
}
