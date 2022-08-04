package com.mypage.mypage.repo;

import com.mypage.mypage.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findRoleByName(String name);
}
