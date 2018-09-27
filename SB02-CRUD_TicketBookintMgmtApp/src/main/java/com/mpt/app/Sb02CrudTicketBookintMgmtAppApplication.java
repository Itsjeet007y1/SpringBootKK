package com.mpt.app;

import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpt.app.entities.Ticket;
import com.mpt.app.service.TicketBookingService;

@SpringBootApplication
public class Sb02CrudTicketBookintMgmtAppApplication implements CommandLineRunner {

	@Autowired
	private TicketBookingService ticketBookingService;
	
	@Autowired
	private DataSource dataSource;
	
	public static void main(String[] args) {
		SpringApplication.run(Sb02CrudTicketBookintMgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setPassengerName("Jitendra Kumar");
		ticket.setJourneyDate(new Date());
		ticket.setSourceDestination("Banglore");
		ticket.setDestination("Lucknow");
		ticketBookingService.createTicket(ticket);
		System.out.println("Data Source: "+dataSource.getClass());
	}
}
