package kr.co.qrbank.movieticketing.domain;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Entity;

@Comment("퍼센트에 따른 할인 정책")
@Entity
public class PercentDiscountPolicy extends DiscountPolicy{
	private Double percent;

	public PercentDiscountPolicy (Double percent, DiscountCondition... conditions) {
		this.percent = percent;
	}

	public PercentDiscountPolicy () {
	}

	@Override
	protected Money getDiscountAmount (Screening screening) {
		return screening.getMovieFee().times(percent);
	}

}
