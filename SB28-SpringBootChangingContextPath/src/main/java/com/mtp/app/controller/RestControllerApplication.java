package com.mtp.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApplication {

	@GetMapping
	public String getMessage() {
		return "Hello World !!";
	}
}
