package com.itmuch.cloud.feign.server;

import com.itmuch.cloud.feign.FeignLogConfiguration;
import com.itmuch.cloud.feign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author dome
 */
@FeignClient(name = "microservice-provider-user", configuration = FeignLogConfiguration.class)
public interface UserFeignClient {

    /**
     * 通过id获取用户信息
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);
}
