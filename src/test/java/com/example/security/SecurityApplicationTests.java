package com.example.security;

import com.example.security.Entitys.User;
import com.example.security.Repository.UserRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Optional;

@SpringBootTest
class SecurityApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void testRepository() {
		User user = userRepository.save(new User("Pascal", "Berg", "ROLE_USER"));
		assert user != null;
		Optional<User> userByUsername = userRepository.findByUsername("Pascal");
		assert userByUsername.isPresent();

	}

	@AfterEach
	void cleanRepository(){
		userRepository.deleteAll();
	}

}
