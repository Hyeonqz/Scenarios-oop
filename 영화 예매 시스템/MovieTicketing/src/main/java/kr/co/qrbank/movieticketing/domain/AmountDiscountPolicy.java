package kr.co.qrbank.movieticketing.domain;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;

@Comment("일정 금액 할인 정책")
@Entity
public class AmountDiscountPolicy extends DiscountPolicy {

	@OneToOne(fetch = FetchType.LAZY)
	private Money discountAmount;

	public AmountDiscountPolicy () {

	}

	@Override
	protected Money getDiscountAmount (Screening screening) {
		return discountAmount;
	}


	public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
		this.discountAmount = discountAmount;
	}
}
