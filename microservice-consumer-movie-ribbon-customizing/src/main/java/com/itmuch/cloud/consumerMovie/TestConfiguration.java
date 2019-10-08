package com.itmuch.cloud.consumerMovie;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "microservice-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {

}