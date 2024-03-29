package com.application.MyPage.Controllers;

import com.application.MyPage.Models.User;
import com.application.MyPage.Models.UserWithRoles;
import com.application.MyPage.Repo.UserRepo;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    private final UserRepo userDao;
    private PasswordEncoder passwordEncoder;

    public UserController(UserRepo userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/signup")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "signup";
    }

    @PostMapping("/signup")
    public String saveUser(@ModelAttribute User user, Model model){
        if(userDao.findUserByUsername(user.getUsername()) == null) {
            String hash = passwordEncoder.encode(user.getPassword());
            user.setPassword(hash);
            //will set roles here later
/*
        UserWithRoles userWithRoles = new UserWithRoles(user);
*/
            user.setStatus("Welcome To MyPage!");
            user.setBio("I am a content creator");
            userDao.save(user);
        } else {
            model.addAttribute("error", "There seems to already be an account associated with that information");
            return "signup";
        }
        return "redirect:/login";
    }
}
