package com.soloworld.security.controller;

import com.soloworld.security.model.User;
import com.soloworld.security.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @GetMapping("/user")
    public List<User> getUsers() {
        return userService.getUsers();
    }

    public UserController(UserService userService) {
        this.userService = userService;
    }
}
