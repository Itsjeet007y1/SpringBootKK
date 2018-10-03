package com.mtp.app;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import com.mtp.app.entities.Person;
import com.mtp.app.service.PeopleMgmtService;

@SpringBootApplication
@EnableAsync
public class Sb04PeopleMgmtSpringDataApplication implements CommandLineRunner {

	@Autowired
	private PeopleMgmtService peopleMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(Sb04PeopleMgmtSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		CompletableFuture<Person> completableFuture = peopleMgmtService.findByEmail("dh@gmail.com");
		Person person = completableFuture.get(1, TimeUnit.SECONDS);
		System.out.println(person);
	}
}
