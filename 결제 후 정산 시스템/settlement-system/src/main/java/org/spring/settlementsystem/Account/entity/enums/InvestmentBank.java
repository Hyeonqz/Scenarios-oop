package org.spring.settlementsystem.Account.entity.enums;

public enum InvestmentBank {

	MIRAEASSET("미래에셋증권","400"),
	TOSS("토스증권", "401"),
	KAKAOPAY("카카오페이증권","402"),
	SAMSUNG("삼성증권","403"),
	NAEMU("NH나무증권","404"),

	;
	private String name;
	private String uniqueNo;

	InvestmentBank (String name, String uniqueNo) {
		this.name = name;
		this.uniqueNo = uniqueNo;
	}

	public String getName () {
		return name;
	}

	public String getUniqueNo () {
		return uniqueNo;
	}
}
