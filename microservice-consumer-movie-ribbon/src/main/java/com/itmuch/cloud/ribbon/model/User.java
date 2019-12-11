package com.itmuch.cloud.ribbon.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class User {

    private long id;

    private String username;

    private String name;

    private Integer age;

    private BigDecimal balance;
}