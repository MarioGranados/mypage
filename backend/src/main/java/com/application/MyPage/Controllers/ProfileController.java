package com.application.MyPage.Controllers;

import com.application.MyPage.Models.Link;
import com.application.MyPage.Models.User;
import com.application.MyPage.Repo.LinkRepo;
import com.application.MyPage.Repo.UserRepo;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping ("/profile/{id}/edit")
    private String editLink(@PathVariable Long id) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Link updatedLink = linkRepo.findByLinkId(id);
        linkRepo.save(updatedLink);
        return "redirect:/profile";
    }

    @GetMapping("/profile/{id}/delete")
    private String deleteLink(@PathVariable Long id) {
        Link linkToBeDeleted = linkRepo.findByLinkId(id);
        linkRepo.delete(linkToBeDeleted);
        return "redirect:/profile";
    }

    @PostMapping("/profile/bio")
    private String editBio(@RequestParam (name = "bio") String bio) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user.setBio(bio);
        return "redirect:/profile";
    }

    @PostMapping("/profile/status")
    private String setStatus(@RequestParam (name = "bio") String status) {
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user.setStatus(status);
        return "redirect:/profile";
    }

    @PostMapping("/profile/edit-profile")
    private String editProfile(@ModelAttribute User user) {
        User updatedUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        //coppy method here
        return "redirect:/profile";

    }


}
