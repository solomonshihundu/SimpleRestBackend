package com.ss.rest.api.simplebackend;

import com.ss.rest.api.simplebackend.model.ERole;
import com.ss.rest.api.simplebackend.model.Role;
import com.ss.rest.api.simplebackend.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleBackendApplication implements ApplicationRunner
{
	private RoleRepository roleRepository;

	@Autowired
	public SimpleBackendApplication(RoleRepository roleRepository) {
		this.roleRepository = roleRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleBackendApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		roleRepository.save(new Role(ERole.ROLE_USER));
		roleRepository.save(new Role(ERole.ROLE_ADMIN));
		roleRepository.save(new Role(ERole.ROLE_MODERATOR));
	}
}

