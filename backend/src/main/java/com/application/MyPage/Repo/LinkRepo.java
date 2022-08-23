package com.application.MyPage.Repo;

import com.application.MyPage.Models.Link;
import com.application.MyPage.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepo extends JpaRepository<Link, Long> {
    List<Link> findAllByUser(User user);
    Link findByLinkId(Long id);
}
