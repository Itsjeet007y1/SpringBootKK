package com.mpt.app.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue
	private Integer ticketId;
	private String passengerName;
	private Date journeyDate;
	private String sourceDestination;
	private String destination;
	public Integer getTicketId() {
		return ticketId;
	}
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Date getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(Date journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getSourceDestination() {
		return sourceDestination;
	}
	public void setSourceDestination(String sourceDestination) {
		this.sourceDestination = sourceDestination;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ticket [ticketId=");
		builder.append(ticketId);
		builder.append(", passengerName=");
		builder.append(passengerName);
		builder.append(", journeyDate=");
		builder.append(journeyDate);
		builder.append(", sourceDestination=");
		builder.append(sourceDestination);
		builder.append(", destination=");
		builder.append(destination);
		builder.append("]");
		return builder.toString();
	}
}
