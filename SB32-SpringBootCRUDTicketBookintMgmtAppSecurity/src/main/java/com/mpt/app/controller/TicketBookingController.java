package com.mpt.app.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mpt.app.entities.Ticket;
import com.mpt.app.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
	
	@Autowired
	private TicketBookingService ticketBookingService;
	
	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	
	@GetMapping(value = "ticket/{ticketId}")
	public Optional<Ticket> getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.TicketById(ticketId);
	}
	
	@GetMapping(value = "ticket/allTickets")
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingService.getAllTickets();
	}
	
	@DeleteMapping(value = "ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}
	
	@PutMapping(value = "ticket/{ticketId}/{destination}")
	public Ticket updateTicket(@PathVariable("ticketId") Integer ticketId, @PathVariable("destination") String destination) {
		return ticketBookingService.updateTicket(ticketId, destination);
	}
}
