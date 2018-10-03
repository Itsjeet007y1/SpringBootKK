package com.mtp.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Sb15SpringBootLoggingApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(Sb15SpringBootLoggingApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Sb15SpringBootLoggingApplication.class, args);
		LOGGER.error("Message logged at error");
		LOGGER.warn("Message logged at warn");
		LOGGER.info("Message logged at info");
		LOGGER.debug("Message logged at debug");
	}
	
	@GetMapping("/")
	public String getMsg() {
		return "Hello World !!!";
	}
}
