package com.mpt.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.mpt.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {

}
