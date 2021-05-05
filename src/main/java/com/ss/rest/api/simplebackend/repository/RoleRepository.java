package com.ss.rest.api.simplebackend.repository;

import com.ss.rest.api.simplebackend.model.ERole;
import com.ss.rest.api.simplebackend.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer>
{
    Optional<Role> findByName(ERole role);
}
