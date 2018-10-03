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
	public List<Person> findByLastNameOrFirstName(String lastName, String firstName) {
		return peopleMgmtDao.findByLastNameOrFirstName(lastName, firstName);
	}
}
