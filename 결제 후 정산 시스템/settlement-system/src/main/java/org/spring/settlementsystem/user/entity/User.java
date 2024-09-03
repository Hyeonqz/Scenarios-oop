package org.spring.settlementsystem.user.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.spring.settlementsystem.Account.entity.Account;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "users")
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String phoneNumber;
	private String email;

	@Embedded
	private Address address;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime createdAt;

	/*
	* User 엔티티는 관계의 주인이 아니기 때문에 mappedBy 를 사용하여 Account 엔티티의 user 필드가 이 연관 관계를 관리하도록 한다.
	* */
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Account> accounts = new ArrayList<>();

	public User (String name, String phoneNumber, String email, Address address, LocalDateTime createdAt) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.createdAt = createdAt;
	}

	public User (Long id) {
		this.id = id;
	}

	public User () {
	}

	public User (Long id, String name, String phoneNumber, String email, Address address, LocalDateTime createdAt,
		List<Account> accounts) {
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.createdAt = createdAt;
		this.accounts = accounts;
	}

	public Long getId () {
		return id;
	}

	public String getName () {
		return name;
	}

	public String getPhoneNumber () {
		return phoneNumber;
	}

	public String getEmail () {
		return email;
	}

	public Address getAddress () {
		return address;
	}

	public LocalDateTime getCreatedAt () {
		return createdAt;
	}

	public List<Account> getAccounts () {
		return accounts;
	}

}
