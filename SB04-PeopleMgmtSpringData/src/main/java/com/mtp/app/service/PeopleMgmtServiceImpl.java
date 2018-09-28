package com.mtp.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtp.app.dao.PeopleMgmtDao;
import com.mtp.app.entities.Person;

@Service
public class PeopleMgmtServiceImpl implements PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peopleMgmtDao;
	
	@Override
	public Person createPerson(Person person) {
		return peopleMgmtDao.save(person);
	}

	@Override
	public Iterable<Person> createPersons(List<Person> personList) {
		return peopleMgmtDao.saveAll(personList);
	}

}
