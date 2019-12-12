package com.itmuch.cloud.providerUser.controller;

import com.itmuch.cloud.providerUser.dao.UserRepository;
import com.itmuch.cloud.providerUser.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin.liveconnect.SecurityContextHelper;

import java.util.Collection;
import java.util.Optional;

@RestController
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails) {
            UserDetails details = (UserDetails) principal;
            Collection<? extends GrantedAuthority> collection = details.getAuthorities();
            for (GrantedAuthority c : collection) {
                LOGGER.info("当前登录用户是{},角色是{}", details.getUsername(), c.getAuthority());
            }
        } else {
            //do other things
        }
        User fineOne = userRepository.findById(id).orElse(null);
        return fineOne;
    }
}
