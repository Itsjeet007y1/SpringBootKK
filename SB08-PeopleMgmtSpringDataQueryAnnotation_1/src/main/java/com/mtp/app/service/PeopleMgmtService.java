package com.mtp.app.service;

import java.util.List;

import com.mtp.app.entities.Person;

public interface PeopleMgmtService {

	List<Person> getPersonInfoByFirstName(String string);

	List<Person> findByFirstNameAndEmail(String string, String string2);
}
