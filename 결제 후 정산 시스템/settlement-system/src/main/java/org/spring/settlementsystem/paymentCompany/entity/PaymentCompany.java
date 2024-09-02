package org.spring.settlementsystem.paymentCompany.entity;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Comment("신용,체크 카드 결제가 아닌 간편결제사일 경우 테이블")
@Entity
public class PaymentCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
