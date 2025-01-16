package org.example.springbootdemo.controller;

import org.example.springbootdemo.model.User;
import org.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/users")
    public String findAll(Model model) {
        List<User> users = userService.findAllUsers();
        model.addAttribute("users", users);
        return "users-list";
    }

    @GetMapping("/user-create")
    public String CreateUserForm(User user) {
        return "user-create";
    }

    @PostMapping
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/users";
    }
}
