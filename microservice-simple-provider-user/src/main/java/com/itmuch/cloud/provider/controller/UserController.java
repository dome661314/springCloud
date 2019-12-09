package com.itmuch.cloud.provider.controller;

import com.itmuch.cloud.provider.dao.UserRepository;
import com.itmuch.cloud.provider.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = userRepository.findById(id).orElse(null);
        return user;
    }
}
