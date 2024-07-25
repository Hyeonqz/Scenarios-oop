package kr.co.qrbank.movieticketing.service.discount.policy;

import org.springframework.stereotype.Service;

import kr.co.qrbank.movieticketing.domain.Money;
import kr.co.qrbank.movieticketing.domain.Screening;
import kr.co.qrbank.movieticketing.service.discount.policy.inter.DiscountPolicy;

@Service
public class NoneDiscountPolicy implements DiscountPolicy {

	@Override
	public Money calculateDiscountAmount (Screening screening) {
		return Money.ZERO;
	}

}
