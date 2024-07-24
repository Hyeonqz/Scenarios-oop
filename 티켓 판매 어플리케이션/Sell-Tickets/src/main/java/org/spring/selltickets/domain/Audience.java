package org.spring.selltickets.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
public class Audience extends BaseEntity{

	private Bag bag;

	public Long buy(Ticket ticket) {
		return bag.hold(ticket);
	}

	public Audience (Bag bag) {
		this.bag = bag;
	}
}
