package com.mtp.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.mtp.app.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {
	@Query(value = "SELECT p FROM Person p WHERE p.firstName = ?1")
	List<Person> getPersonInfoByFirstName(String lastName);
	
	@Query("SELECT p FROM Person p WHERE p.firstName = ?1 AND p.email = ?2")
	List<Person> findByFirstNameAndEmail(String firstName, String email);
}
