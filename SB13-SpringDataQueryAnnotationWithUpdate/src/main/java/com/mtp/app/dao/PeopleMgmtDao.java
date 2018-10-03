package com.mtp.app.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mtp.app.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query("Update Person set email=:email WHERE id=:id")
	void updateEmailById(@Param("id")int id, @Param("email")String newEmail);
	
}
