package com.mypage.mypage.controllers;

import com.mypage.mypage.models.Link;
import com.mypage.mypage.models.User;
import com.mypage.mypage.repo.LinkRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/links")
public class LinkController {
    private final LinkRepo linkRepo;

    LinkController(LinkRepo linkRepo) {
        this.linkRepo = linkRepo;
    }

    //fetch requests to recieve all users
    @GetMapping("/links")
    List<Link> all() {
        return linkRepo.findAll();
    }

    //fetch post request
    @PostMapping("/links")
    Link newLink(@RequestBody Link link) {
        return linkRepo.save(link);
    }


}
