package com.greatlearning.tta.service;

import java.util.List;

import com.greatlearning.tta.entity.Ticket;

public interface ServiceInterface {

	public void addTicket(Ticket t);

	public List<Ticket> getAllTickets();

	public Ticket getTicketById(int id);

	public void delTicket(int id);

	public List<Ticket> getByKeyword(String keyword);

}
