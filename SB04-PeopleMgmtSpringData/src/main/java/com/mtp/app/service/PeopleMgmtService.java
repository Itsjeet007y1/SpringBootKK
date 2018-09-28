package com.mtp.app.service;

import java.util.List;

import com.mtp.app.entities.Person;

public interface PeopleMgmtService {

	Person createPerson(Person person);

	Iterable<Person> createPersons(List<Person> personList);

	Iterable<Person> getPersonByIds(List<Integer> ids);

}
