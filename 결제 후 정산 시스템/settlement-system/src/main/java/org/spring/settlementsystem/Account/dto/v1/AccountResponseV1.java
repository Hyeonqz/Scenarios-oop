package org.spring.settlementsystem.Account.dto.v1;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.spring.settlementsystem.common.enums.Bank;

public record AccountResponseV1(String accountNo, BigDecimal amount, Bank bank, Long userId, LocalDateTime createAt) {
}
