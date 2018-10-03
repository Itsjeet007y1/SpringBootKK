package com.mtp.app.service;

import java.util.concurrent.CompletableFuture;

import com.mtp.app.entities.Person;

public interface PeopleMgmtService {

	CompletableFuture<Person> findByEmail(String string);

}
