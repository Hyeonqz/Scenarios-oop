package org.spring.settlementsystem.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.query.JpaQueryMethodFactory;

import jakarta.persistence.EntityManager;

@Configuration
public class QueryDSLConfig {

	private final EntityManager entityManager;

	public QueryDSLConfig (EntityManager entityManager) {
		this.entityManager = entityManager;
	}


}
