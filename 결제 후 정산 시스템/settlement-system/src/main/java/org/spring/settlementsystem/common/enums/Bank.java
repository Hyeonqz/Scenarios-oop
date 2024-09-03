package org.spring.settlementsystem.common.enums;

public enum  Bank {

	KBANK("케이뱅크","100"),
	KAKAO_BANK("카카오뱅크","101"),
	TOSS_BANK("토스뱅크","102"),
	KB("국민은행","103"),
	NH_BANK("농협은행","104"),
	IBK("기업은행","105"),
	HANA_BANK("하나은행","106"),
	SHINHAN_BANK("신한은행","107")
	;

	private String name;
	private String uniqueNo;

	Bank (String name, String uniqueNo) {
	}

	public String getName () {
		return name;
	}

	public String getUniqueNo () {
		return uniqueNo;
	}
}
