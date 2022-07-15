package com.mypage.mypage.repo;

import com.mypage.mypage.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
