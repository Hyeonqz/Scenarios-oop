package org.spring.selltickets.domain;

import jakarta.persistence.Entity;

@Entity
public class Bag extends BaseEntity{
	private Long cash;
	private Ticket ticket;
	private Invitation invitation;

	public Long hold(Ticket ticket) {
		if(hasInvitation()) {
			setTicket(ticket);
			return 0L;
		} else {
			setTicket(ticket);
			minusCash(ticket.getFee());
			return ticket.getFee();
		}
	}

	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	private boolean hasInvitation() {
		return invitation != null;
	}

	private void minusCash(Long cash) {
		this.cash -= cash;
	}
}
