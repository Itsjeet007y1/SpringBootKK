package com.mtp.app;


import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mtp.app.config.EnvBasedConfig;

@SpringBootApplication
public class Sb21SpringBootProfilesApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private EnvBasedConfig envBasedConfig;
	
	public static void main(String[] args) {
		SpringApplication.run(Sb21SpringBootProfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("----------------------------------------------------------");
		System.out.println("DataSource: "+dataSource);
		System.out.println("----------------------------------------------------------");
		envBasedConfig.setup();
	}
	
}
