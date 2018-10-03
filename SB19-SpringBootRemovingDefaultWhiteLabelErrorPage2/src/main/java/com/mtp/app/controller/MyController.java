package com.mtp.app.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController implements ErrorController {

	private static final String PATH = "/error";
	
	@GetMapping("/welcome")
	public String getMsg() {
		return "Hello World !!!";
	}

	@GetMapping(PATH)
	public String getErrorMsg() {
		return "Requested Page is not avaialable !!!";
	}
	
	@Override
	public String getErrorPath() {
		return PATH;
	}
}
