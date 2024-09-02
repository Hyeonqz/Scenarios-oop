package org.spring.settlementsystem.Account.entity.enums;

import java.util.UUID;

public enum Bank {

	KAKAO_BANK("카카오뱅크","3333"),
	NH_BANK("농협은행","352"),
	TOSS_BANK("토스뱅크","1001"),
	KB("국민은행","942"),
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
