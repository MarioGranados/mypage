package com.mypage.mypage.repo;

import com.mypage.mypage.models.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepo extends JpaRepository<Link, Long> {
}
