package org.spring.settlementsystem.Account.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.hibernate.annotations.Comment;
import org.spring.settlementsystem.common.enums.Bank;
import org.spring.settlementsystem.user.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true, nullable = false)
	@Comment("계좌번호")
	private String accountNo;

	@Column()
	@Comment("계좌에 있는 금액")
	private BigDecimal amount;

	@Column(columnDefinition = "varchar(20)")
	@Enumerated(EnumType.STRING)
	private Bank bank;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id") // 위 어노테이션을 설정하지 않으면 자동으로 필드이름_id 로 설정을 해준다.
	private User user;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdTime;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime updatedTime;

	public void createAccount (String accountNo, Bank bank, BigDecimal amount, User user) {
		this.accountNo = accountNo;
		this.bank = bank;
		this.amount = amount;
		this.user = user;
		this.createdTime = LocalDateTime.now();
	}


	public Account (String s, BigDecimal amount, Bank bank, User user, LocalDateTime now) {
		this.accountNo = s;
		this.amount = amount;
		this.bank = bank;
		this.user = user;
		this.createdTime = now;
	}

	public Account () {
	}

	public Long getId () {
		return id;
	}

	public String getAccountNo () {
		return accountNo;
	}

	public BigDecimal getAmount () {
		return amount;
	}

	public Bank getBank () {
		return bank;
	}

	public User getUser () {
		return user;
	}

	public LocalDateTime getCreatedTime () {
		return createdTime;
	}

	public LocalDateTime getUpdatedTime () {
		return updatedTime;
	}

}
