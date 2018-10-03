package com.mtp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Sb17SpringBootEmbededServersApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb17SpringBootEmbededServersApplication.class, args);
	}
}

@RestController
class MyRestController	 {
	
	@GetMapping
	public String getMsg() {
		return "Hello World !!";
	}
}
