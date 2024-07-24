package org.spring.selltickets.domain;

import jakarta.persistence.Entity;

@Entity
public class TicketSeller extends BaseEntity{

	private TicketOffice ticketOffice;

	public void sellTo(Audience audience) {
		ticketOffice.sellTicketTo(audience);
	}
}
