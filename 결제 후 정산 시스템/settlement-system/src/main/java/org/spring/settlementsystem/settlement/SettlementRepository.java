package org.spring.settlementsystem.settlement;

import org.spring.settlementsystem.settlement.entity.Settlement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettlementRepository extends JpaRepository<Settlement, Long> {
}
