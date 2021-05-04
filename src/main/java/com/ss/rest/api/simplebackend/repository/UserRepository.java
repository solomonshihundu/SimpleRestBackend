package com.ss.rest.api.simplebackend.repository;

import com.ss.rest.api.simplebackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUsername(String username);
}
