package com.mtp.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sb27SpringBootChangingDefaultServerPortApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(Sb27SpringBootChangingDefaultServerPortApplication.class);
		Map<String, Object> config = new HashMap<>();
		config.put("SERVER_PORT", 8888);
		application.setDefaultProperties(config);
		application.run(args);
	}
}
