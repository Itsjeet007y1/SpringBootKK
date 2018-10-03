package com.mtp.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mtp.app.entities.Person;
import com.mtp.app.service.PeopleMgmtService;

@SpringBootApplication
public class Sb04PeopleMgmtSpringDataApplication implements CommandLineRunner {

	@Autowired
	private PeopleMgmtService peopleMgmtService;
	
	public static void main(String[] args) {
		SpringApplication.run(Sb04PeopleMgmtSpringDataApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> personList = peopleMgmtService.findByLastNameOrFirstName("Kumar", "Jitendra");
		personList.forEach(System.out::println);
	}
}
