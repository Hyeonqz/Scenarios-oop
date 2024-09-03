package org.spring.settlementsystem.Account.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.spring.settlementsystem.Account.entity.Account;
import org.spring.settlementsystem.Account.repository.AccountRepository;
import org.spring.settlementsystem.common.enums.Bank;
import org.spring.settlementsystem.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AccountServiceTest {
	@Autowired
	private AccountRepository accountRepository;

	@Test
	@DisplayName("계좌 생성 테스트")
	void create_Account_Test() {
	    // given
		Bank bank = Bank.TOSS_BANK;
		User user = new User(1L);
		Account account = new Account(
			"100-1234-567",BigDecimal.TEN, bank, user, LocalDateTime.now()
		);

	    // when
		accountRepository.save(account);

	    // then
		assertNotNull(account);
	}

}