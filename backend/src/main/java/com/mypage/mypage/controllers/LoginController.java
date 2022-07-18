package com.mypage.mypage.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/login")
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "users/login";
    }

}
