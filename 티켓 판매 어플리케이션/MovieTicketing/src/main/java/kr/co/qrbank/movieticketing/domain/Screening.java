package kr.co.qrbank.movieticketing.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Screening {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(mappedBy = "screening")
	private Reservation reservation;

	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;

	public Screening (Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}

	public LocalDateTime getStartTime() {
		return whenScreened;
	}

	public boolean isSequence(int sequence) {
		return this.sequence == sequence;
	}

	public Money getMovieFee() {
		return movie.getFee();
	}

	public Reservation reserver(Customer customer, int audienceCount) {
		return new Reservation(customer, this, calculateFee(audienceCount), audienceCount);
	}

	private Money calculateFee(int audienceCount) {
		return movie.calculateMovieFee(this).times(audienceCount);
	}

}
