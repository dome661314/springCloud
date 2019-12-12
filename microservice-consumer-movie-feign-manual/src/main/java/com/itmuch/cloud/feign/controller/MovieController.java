package com.itmuch.cloud.feign.controller;

import com.itmuch.cloud.feign.model.User;
import com.itmuch.cloud.feign.server.UserFeignClient;
import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dome
 */
@Import(FeignClientsConfiguration.class)
@RestController
public class MovieController {

    private UserFeignClient userFeignClient;

    private UserFeignClient adminFeignClient;

    @Autowired
    public MovieController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.userFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("user", "user"))
                .target(UserFeignClient.class, "http://microservice-provider-user/");
        this.adminFeignClient = Feign.builder().client(client).encoder(encoder).decoder(decoder).contract(contract)
                .requestInterceptor(new BasicAuthRequestInterceptor("admin", "admin"))
                .target(UserFeignClient.class, "http://microservice-provider-user/");
    }

    @GetMapping("/user-user/{id}")
    public User findByIdUser(@PathVariable Long id) {
        User user = this.userFeignClient.findById(id);
        return user;
    }

    @GetMapping("/user-admin/{id}")
    public User findByIdAdmin(@PathVariable Long id) {
        return this.adminFeignClient.findById(id);
    }
}
