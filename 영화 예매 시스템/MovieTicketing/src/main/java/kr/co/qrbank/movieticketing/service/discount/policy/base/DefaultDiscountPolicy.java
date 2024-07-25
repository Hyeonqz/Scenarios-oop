package kr.co.qrbank.movieticketing.service.discount.policy.base;

import kr.co.qrbank.movieticketing.domain.Money;
import kr.co.qrbank.movieticketing.domain.Screening;
import kr.co.qrbank.movieticketing.service.discount.policy.inter.DiscountPolicy;

public class DefaultDiscountPolicy implements DiscountPolicy {

	@Override
	public Money calculateDiscountAmount (Screening screening) {
		return null;
	}

}
