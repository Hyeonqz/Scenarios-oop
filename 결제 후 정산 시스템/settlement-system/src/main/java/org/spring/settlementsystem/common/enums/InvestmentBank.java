package org.spring.settlementsystem.common.enums;

public enum InvestmentBank {

	MIRAEASSET("미래에셋증권","200"),
	TOSS("토스증권", "201"),
	KAKAOPAY("카카오페이증권","202"),
	SAMSUNG("삼성증권","203"),
	NAEMU("NH나무증권","204"),

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
