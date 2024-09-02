package org.spring.settlementsystem.merchant.entity;

import org.hibernate.annotations.NaturalId;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Merchant {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
