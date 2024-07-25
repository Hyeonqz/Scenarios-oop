package kr.co.qrbank.movieticketing;

import java.time.Duration;

import kr.co.qrbank.movieticketing.domain.Money;
import kr.co.qrbank.movieticketing.domain.Movie;
import kr.co.qrbank.movieticketing.service.discount.policy.NoneDiscountPolicy;

public class Main {
	public static void main (String[] args) {
		Movie starWars = new Movie("스타워즈", Duration.ofMinutes(210), Money.wons(10000), new NoneDiscountPolicy());
	}
}
