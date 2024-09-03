package org.spring.settlementsystem.merchant.repository;

import org.spring.settlementsystem.merchant.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantRepository extends JpaRepository<Merchant, Long> {
}
