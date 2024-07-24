package org.spring.selltickets.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Ticket extends BaseEntity{
	private Long fee;

	public Long getFee() {
		return fee;
	}

	public void remove(Long amount) {
		fee -= amount;
	}
}
