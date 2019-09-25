package com.itmuch.cloud.providerUser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UserMetadataApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMetadataApplication.class, args);
    }

}
