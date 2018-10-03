package com.mtp.app.dao;

import java.util.concurrent.CompletableFuture;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.mtp.app.entities.Person;

public interface PeopleMgmtDao extends CrudRepository<Person, Integer> {

	@Async
	CompletableFuture<Person> findByEmail(String email);
	
}
