package kr.co.qrbank.movieticketing.service.discount.policy;

import org.hibernate.annotations.Comment;

import kr.co.qrbank.movieticketing.domain.Money;
import kr.co.qrbank.movieticketing.domain.Screening;
import kr.co.qrbank.movieticketing.service.discount.condition.inter.DiscountCondition;
import kr.co.qrbank.movieticketing.service.discount.policy.base.DefaultDiscountPolicy;

@Comment("퍼센트에 따른 할인 정책")
public class PercentDiscountPolicy extends DefaultDiscountPolicy {
	private Double percent;

	public PercentDiscountPolicy (Double percent, DiscountCondition... conditions) {
		this.percent = percent;
	}

	public PercentDiscountPolicy () {
	}

	@Override
	public Money calculateDiscountAmount (Screening screening) {
		return super.calculateDiscountAmount(screening);
	}

}
