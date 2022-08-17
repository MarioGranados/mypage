package com.application.MyPage.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProfileController {
    @GetMapping("/profile")
    private String profile() {
        return "profile";
    }

    @PostMapping("/profile")
    private String profilePost() {
        return "profile";
    }

}
