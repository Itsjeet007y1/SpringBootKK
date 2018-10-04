package com.mtp.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Sb22SpringBootWithXmlRestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb22SpringBootWithXmlRestAppApplication.class, args);
	}
}
