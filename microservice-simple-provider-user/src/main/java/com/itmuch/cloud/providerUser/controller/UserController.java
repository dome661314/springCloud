package com.itmuch.cloud.providerUser.controller;

import com.itmuch.cloud.ProviderUser.dao.UserRepository;
import com.itmuch.cloud.ProviderUser.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

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
