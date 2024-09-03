package org.spring.settlementsystem.user.repository;

import org.spring.settlementsystem.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {
}
