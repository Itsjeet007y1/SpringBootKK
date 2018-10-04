package com.mpt.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpt.app.dao.TicketBookingDao;
import com.mpt.app.entities.Ticket;

@Service
public class TicketBookingService {
	
	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	public Optional<Ticket> TicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId);
	}

	public Iterable<Ticket> getAllTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String destination) {
		Optional<Ticket> optional = ticketBookingDao.findById(ticketId);
		Ticket ticketFromDB = optional.get();
		ticketFromDB.setDestination(destination);
		Ticket updatedTicket = ticketBookingDao.save(ticketFromDB);
		return updatedTicket;
	}
}
