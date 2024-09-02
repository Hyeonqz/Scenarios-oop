package org.spring.settlementsystem.Account.entity;

import org.spring.settlementsystem.Account.entity.enums.Bank;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String accountNo;

	private String amount;

	@Enumerated(EnumType.STRING)
	private Bank bank;


}
