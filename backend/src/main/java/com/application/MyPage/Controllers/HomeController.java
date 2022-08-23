package com.application.MyPage.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

/*    @PostMapping("/")
    public String postHomePage() {
        return "index";
    }*/
}
