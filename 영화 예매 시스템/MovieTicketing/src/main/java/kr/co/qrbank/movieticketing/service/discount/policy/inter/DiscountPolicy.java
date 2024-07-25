package kr.co.qrbank.movieticketing.service.discount.policy.inter;

import org.hibernate.annotations.Comment;

import kr.co.qrbank.movieticketing.domain.Money;
import kr.co.qrbank.movieticketing.domain.Screening;

@Comment("할인 정책")
public interface  DiscountPolicy {

	Money calculateDiscountAmount(Screening screening);

}
