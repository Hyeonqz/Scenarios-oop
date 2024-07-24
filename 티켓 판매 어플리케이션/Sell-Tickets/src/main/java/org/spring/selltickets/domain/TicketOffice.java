package org.spring.selltickets.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;

@Entity
public class TicketOffice extends BaseEntity{

	@OneToMany
	private List<Ticket> ticket = new ArrayList<>();

	private Long amount;

	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTicket()));
	}

	private Ticket getTicket() {
		return ticket.remove(0);
	}

	private void plusAmount(Long amount) {
		this.amount += amount;
	}
}
