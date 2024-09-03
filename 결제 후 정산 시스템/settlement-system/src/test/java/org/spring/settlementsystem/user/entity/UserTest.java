package org.spring.settlementsystem.user.entity;


import java.time.LocalDateTime;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.spring.settlementsystem.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cglib.core.Local;

@SpringBootTest
class UserTest {

	@Autowired
	private UserRepository userRepository;

	@BeforeEach
	public void setUp() {
		System.out.println("테스트 시작");
	}

	@Test
	@DisplayName("User_생성")
	void create_User() {
		// given
		Address address = new Address("67890","경기도 평택시","중구 302 다라아파트 203-2304");
		User user = new User("김현규","010564801252","abasd78@naver.com",address, LocalDateTime.now());

		// when
		userRepository.save(user);

	    // then
		Assertions.assertNotNull(user);
	}

























}