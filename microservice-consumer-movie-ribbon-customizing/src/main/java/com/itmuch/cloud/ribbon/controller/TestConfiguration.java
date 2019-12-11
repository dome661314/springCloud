package com.itmuch.cloud.ribbon.controller;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClientConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * @author dome
 */
@Configuration
@RibbonClient(name = "microservice-provider-user", configuration = RibbonClientConfiguration.class)
public class TestConfiguration {

}
