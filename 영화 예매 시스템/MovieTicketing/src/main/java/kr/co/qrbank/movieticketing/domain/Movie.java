package kr.co.qrbank.movieticketing.domain;

import java.time.Duration;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import kr.co.qrbank.movieticketing.service.discount.policy.inter.DiscountPolicy;

@Entity
public class Movie {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private Duration runningTime;

	@OneToOne(fetch = FetchType.LAZY)
	private Money fee;

	@OneToMany
	private DiscountPolicy discountPolicy;

	public Movie () {
	}

	public Movie (String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
		this.title = title;
		this.runningTime = runningTime;
		this.fee = fee;
		this.discountPolicy = discountPolicy;
	}

	public Money getFee() {
		return fee;
	}

	public Money calculateMovieFee(Screening screening) {
		if(discountPolicy == null) {
			return fee;
		}

		return fee.minus(discountPolicy.calculateDiscountAmount(screening));
	}

}
