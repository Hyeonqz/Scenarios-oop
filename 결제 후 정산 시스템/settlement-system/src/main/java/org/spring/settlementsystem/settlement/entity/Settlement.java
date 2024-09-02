package org.spring.settlementsystem.settlement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Settlement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/*
	* 결제 방법이 2가지 이니 정산 방법도 2가지 일듯?
	* interface 랑 abstract 및 상속 섞어가며 추상적으로 만들기
	* */
}
