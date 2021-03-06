package com.mypage.mypage.controllers;

import com.mypage.mypage.models.User;
import com.mypage.mypage.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController {
    private final UserRepo userRepo;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    //fetch requests to recieve all users
    @GetMapping("/users")
    List<User> all() {
        return userRepo.findAll();
    }

    //fetch post request
    @PostMapping("/users")
    User newUser(@RequestBody User user) {
        return userRepo.save(user);
    }



}
