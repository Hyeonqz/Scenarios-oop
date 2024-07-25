package kr.co.qrbank.movieticketing.service.discount.condition.impl;

import java.time.DayOfWeek;
import java.time.LocalTime;

import org.hibernate.annotations.Comment;

import kr.co.qrbank.movieticketing.domain.Screening;
import kr.co.qrbank.movieticketing.service.discount.condition.inter.DiscountCondition;

@Comment("기간 조건")
public class PeriodCondition extends DiscountCondition {
	private DayOfWeek dayOfWeek;
	private LocalTime startTIme;
	private LocalTime endTime;

	public PeriodCondition (DayOfWeek dayOfWeek, LocalTime startTIme, LocalTime endTime) {
		this.dayOfWeek = dayOfWeek;
		this.startTIme = startTIme;
		this.endTime = endTime;
	}

	public PeriodCondition () {
	}

	@Override
	public boolean isSatisfiedBy (Screening screening) {
		return screening.getStartTime().getDayOfWeek().equals(dayOfWeek) &&
			!startTIme.isAfter(screening.getStartTime().toLocalTime()) &&
			!endTime.isBefore(screening.getStartTime().toLocalTime());
	}

}
