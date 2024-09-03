package org.spring.settlementsystem.user.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String zipcode;
	private String mainAddress;
	private String detailAddress;

	public Address () {
	}

	public Address (String zipcode, String mainAddress, String detailAddress) {
		this.zipcode = zipcode;
		this.mainAddress = mainAddress;
		this.detailAddress = detailAddress;
	}

}
