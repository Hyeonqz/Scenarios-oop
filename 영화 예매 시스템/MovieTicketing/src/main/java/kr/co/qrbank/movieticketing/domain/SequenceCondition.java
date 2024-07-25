package kr.co.qrbank.movieticketing.domain;

import org.hibernate.annotations.Comment;

@Comment("순번 조건")
public class SequenceCondition extends DiscountCondition {
	private int sequence;

	public SequenceCondition (int sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean isSatisfiedBy (Screening screening) {
		return screening.isSequence(this.sequence);
	}

}
