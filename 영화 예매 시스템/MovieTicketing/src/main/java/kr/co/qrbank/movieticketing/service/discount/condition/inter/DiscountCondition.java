package kr.co.qrbank.movieticketing.service.discount.condition.inter;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import kr.co.qrbank.movieticketing.domain.Screening;

@Entity
public abstract class DiscountCondition {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	abstract boolean isSatisfiedBy(Screening screening);
}
