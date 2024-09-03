package org.spring.settlementsystem.Account.service;

import java.time.LocalDateTime;

import org.spring.settlementsystem.Account.dto.v1.AccountRequestDtoV1;
import org.spring.settlementsystem.Account.dto.v1.AccountResponseV1;
import org.spring.settlementsystem.Account.entity.Account;
import org.spring.settlementsystem.Account.repository.AccountRepository;
import org.spring.settlementsystem.user.entity.User;
import org.spring.settlementsystem.user.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountService {
	private final AccountRepository accountRepository;
	private final UserRepository userRepository;

	public AccountService (AccountRepository accountRepository, UserRepository userRepository) {
		this.accountRepository = accountRepository;
		this.userRepository = userRepository;
	}

	@Transactional
	public AccountResponseV1 createAccount(AccountRequestDtoV1 accountDtoV1) {
		User user = userRepository.findById(accountDtoV1.userId())
			.orElseThrow(() -> new IllegalArgumentException("User not found"));

		Account account = new Account();
		account.createAccount(accountDtoV1.accountNo(),accountDtoV1.bank(), accountDtoV1.amount(),user);

		accountRepository.save(account);

		return new AccountResponseV1(
			account.getAccountNo(),
			account.getAmount(),
			account.getBank(),
			account.getUser().getId(),
			account.getCreatedTime()
		);
	}

}
