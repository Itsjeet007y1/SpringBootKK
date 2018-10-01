package com.mtp.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mtp.app.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {
	@Query(value = "SELECT * FROM PERSON WHERE FIRST_NAME = ?1", nativeQuery = true )
	List<Person> getPersonInfoByFirstName(String lastName);
	
	@Query(value = "SELECT * FROM PERSON WHERE FIRST_NAME = ?1 AND EMAIL = ?2", nativeQuery = true)
	List<Person> findByFirstNameAndEmail(String firstName, String email);
}
