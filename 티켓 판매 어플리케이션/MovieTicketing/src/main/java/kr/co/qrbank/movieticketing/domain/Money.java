package kr.co.qrbank.movieticketing.domain;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Money {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	public static final Money ZERO = Money.wons(0L);
	private BigDecimal amount;

	public Money () {

	}

	public static Money wons(Long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}

	public static Money wons(double amount) {
		return new Money(BigDecimal.valueOf(amount));
	}

	Money(BigDecimal amount) {
		this.amount = amount;
	}

	public Money plus(Money money) {
		return new Money(this.amount.add(money.amount));
	}

	public Money minus(Money money) {
		return new Money(this.amount.subtract(money.amount));
	}

	public Money times(double percent) {
		return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
	}

	public boolean isLessThan(Money money) {
		return this.amount.compareTo(money.amount) < 0;
	}

	public boolean isGreaterThan(Money money) {
		return this.amount.compareTo(money.amount) >= 0;
	}



}
