package com.mtp.app.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		return peopleMgmtDao.findAllById(ids);
	}

	@Override
	public void deletePersonEntity(Person person) {
		peopleMgmtDao.delete(person);
	}

	@Override
	public void updatePersonEmailById(int id, String string) {
		Optional<Person> optional = peopleMgmtDao.findById(id);
		Person person = optional.get();
		if(person.getId() == id) {
			person.setEmail(string);
			peopleMgmtDao.save(person);
		}
	}

}
