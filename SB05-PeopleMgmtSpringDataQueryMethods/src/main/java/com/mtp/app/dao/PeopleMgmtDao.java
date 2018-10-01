package com.mtp.app.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.mtp.app.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {
	List<Person> findByFirstName(String lastName);
	List<Person> findByFirstNameAndEmail(String firstName, String email);
}
