package com.example.JWTSpring.repository;

import com.example.JWTSpring.model.Role;
import com.example.JWTSpring.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName rolename);
}

