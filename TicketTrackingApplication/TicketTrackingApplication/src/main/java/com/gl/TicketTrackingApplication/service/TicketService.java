package com.gl.TicketTrackingApplication.service;

import java.util.List;

import com.gl.TicketTrackingApplication.entity.Ticket;

//////////////////////////////////////////////////Service class///////////////////////////////////////////

public interface TicketService {

	List<Ticket> getAllTickets();

	Ticket addTicket(Ticket ticket);

	Ticket getTicketById(Long id);

	Ticket updateTicket(Ticket ticket);

	void deleteTicketByid(Long id);

	public List<Ticket> findByKeyword(String keyword);
}
