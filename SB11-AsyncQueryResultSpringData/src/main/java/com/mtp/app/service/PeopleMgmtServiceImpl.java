package com.mtp.app.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtp.app.dao.PeopleMgmtDao;
import com.mtp.app.entities.Person;

@Service
public class PeopleMgmtServiceImpl implements PeopleMgmtService {

	@Autowired
	private PeopleMgmtDao peopleMgmtDao;

	@Override
	public CompletableFuture<Person> findByEmail(String email) {
		return peopleMgmtDao.findByEmail(email);
	}
}
