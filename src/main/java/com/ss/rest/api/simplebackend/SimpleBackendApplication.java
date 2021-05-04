package com.ss.rest.api.simplebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SimpleBackendApplication
{

	public static void main(String[] args) {
		SpringApplication.run(SimpleBackendApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder(12);
	}

}
