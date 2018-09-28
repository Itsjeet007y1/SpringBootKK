package com.mtp.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.mtp.app.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {

}
