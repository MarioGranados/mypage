package com.application.MyPage.Controllers;

import com.application.MyPage.Models.Link;
import com.application.MyPage.Models.User;
import com.application.MyPage.Repo.LinkRepo;
import com.application.MyPage.Repo.UserRepo;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProfileController {

    private LinkRepo linkRepo;
    private UserRepo userRepo;

    private ProfileController(LinkRepo linkRepo, UserRepo userRepo) {
        this.linkRepo = linkRepo;
        this.userRepo = userRepo;
    }

    @GetMapping("/profile")
    private String profile(Model model) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("user", user);
        model.addAttribute("link", new Link());
        model.addAttribute("links", linkRepo.findAll());
        return "profile";
    }

    @PostMapping("/profile/add-link")
    private String addALink(@ModelAttribute Link link) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        link.setUser(user);
        linkRepo.save(link);
        return "redirect:/profile";
    }

}
