package com.gl.TicketTrackingApplication.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

////////////////////////////////////////////////Entity Class//////////////////////////////////////////////

@Entity
public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String ticketTitle;

	@Column
	private String ticketDescription;

	@Column
	private String content;

	@Column
	private LocalDate ticketCreationDate = LocalDate.now();

	public Ticket() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getTicketDescription() {
		return ticketDescription;
	}

	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDate getTicketCreationDate() {
		return ticketCreationDate;
	}

	public void setTicketCreationDate(LocalDate ticketCreationDate) {
		this.ticketCreationDate = ticketCreationDate;
	}

	public Ticket(Long id, String ticketTitle, String ticketDescription, String content, LocalDate ticketCreationDate) {
		super();
		this.id = id;
		this.ticketTitle = ticketTitle;
		this.ticketDescription = ticketDescription;
		this.content = content;
		this.ticketCreationDate = ticketCreationDate;
	}
	
	
}

