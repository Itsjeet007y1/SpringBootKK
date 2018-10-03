package com.mtp.app;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Sb21SpringBootProfilesApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(Sb21SpringBootProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource: "+dataSource);
	}
}
