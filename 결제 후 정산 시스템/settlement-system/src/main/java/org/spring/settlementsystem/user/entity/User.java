package org.spring.settlementsystem.user.entity;

import java.util.ArrayList;
import java.util.List;

import org.spring.settlementsystem.Account.entity.Account;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// User 는 한 개 이상의 계좌를 가진다
	@OneToMany
	private List<Account> accounts = new ArrayList<>();
}
