package kr.co.qrbank.movieticketing.service.discount.policy;

import org.hibernate.annotations.Comment;

import kr.co.qrbank.movieticketing.domain.Money;
import kr.co.qrbank.movieticketing.domain.Screening;
import kr.co.qrbank.movieticketing.service.discount.policy.base.DefaultDiscountPolicy;

@Comment("일정 금액 할인 정책")
public class AmountDiscountPolicy extends DefaultDiscountPolicy {

	private Money discountAmount;

	public AmountDiscountPolicy () {}

	@Override
	public Money calculateDiscountAmount (Screening screening) {
		return super.calculateDiscountAmount(screening);
	}

}
