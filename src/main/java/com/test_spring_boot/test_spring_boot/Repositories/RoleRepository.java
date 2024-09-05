package com.test_spring_boot.test_spring_boot.Repositories;

import com.test_spring_boot.test_spring_boot.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Long> {
    @Query("select r from Role r where r.role = ?1")
    Role findByRole(String role);
}
