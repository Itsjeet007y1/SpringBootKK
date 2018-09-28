package com.mtp.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
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
		//createPerson();
		//createPersons();
		//getPersonsByIds();
		//deletePersonEntity();
		updatePersonEmailById();
	}

	private void updatePersonEmailById() {
		peopleMgmtService.updatePersonEmailById(9, "dharma34@gmail.com");
	}

	private void deletePersonEntity() {
		Person person = new Person();
		person.setId(3);
		peopleMgmtService.deletePersonEntity(person);
	}

	private void getPersonsByIds() {
		List<Integer> ids = new ArrayList<>();
		ids.add(3);
		ids.add(9);
		ids.add(11);
		Iterable<Person> personList = peopleMgmtService.getPersonByIds(ids);
		personList.forEach(System.out :: println);
	}

	private void createPersons() {
		List<Person> personList = Arrays.asList(new Person("Dharmendra", "Kumar", "dh42@gmail.com", new Date()), 
								new Person("Rajendra", "Kumar", "Ra4j2@gmail.com", new Date()));
		Iterable<Person> createdPerson = peopleMgmtService.createPersons(personList);
		for(Person person: createdPerson) {
			System.out.println(person);
		}
	}

	private void createPerson() {
		Person person = new Person("Jitendra", "Kumar", "jeet12462.jp@gmail.com", new Date());
		Person personDb = peopleMgmtService.createPerson(person);
		System.out.println(personDb);
	}
}
