package org.spring.settlementsystem.Account.dto.v1;

import java.math.BigDecimal;

import org.spring.settlementsystem.common.enums.Bank;

public record AccountRequestDtoV1(String accountNo, BigDecimal amount, Bank bank, Long userId) {
}
