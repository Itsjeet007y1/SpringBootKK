package com.mtp.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Value(value = "${welcome.message}")
	private String message;;
	
	@GetMapping("/")
	public String message() {
		return message;
	}
}
