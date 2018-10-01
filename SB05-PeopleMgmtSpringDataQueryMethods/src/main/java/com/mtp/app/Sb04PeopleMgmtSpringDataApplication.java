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
		//getPersonsInfoByFirstName();
		getPersonInfoByFirstNameAndEmail();
	}

	private void getPersonInfoByFirstNameAndEmail() {
		List<Person> personList = peopleMgmtService.getPersonsInfoByFirstName("Jitendra","jeet1.62.jp@gmail.com");
		personList.forEach(System.out::println);
	}

	private void getPersonsInfoByFirstName() {
		List<Person> personList = peopleMgmtService.getPersonsInfoByFirstName("Jitendra");
		personList.forEach(System.out::println);
	}

}
