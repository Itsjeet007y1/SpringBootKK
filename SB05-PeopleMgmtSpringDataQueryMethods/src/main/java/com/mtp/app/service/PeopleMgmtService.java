package com.mtp.app.service;

import java.util.List;

import com.mtp.app.entities.Person;

public interface PeopleMgmtService {

	List<Person> getPersonsInfoByFirstName(String string);

	List<Person> getPersonsInfoByFirstName(String string, String string2);
}
