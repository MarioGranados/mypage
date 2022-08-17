package com.application.MyPage.Repo;

import com.application.MyPage.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findUserByUsername(String username);
}
