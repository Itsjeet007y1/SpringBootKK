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
	public List<Person> getPersonsInfoByFirstName(String lastName) {
		return peopleMgmtDao.findByFirstName(lastName);
	}

	@Override
	public List<Person> getPersonsInfoByFirstName(String firstName, String email) {
		return peopleMgmtDao.findByFirstNameAndEmail(firstName, email);
	}
}
