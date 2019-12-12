package com.itmuch.cloud.feign.server;

import com.itmuch.cloud.feign.FeignConfiguration;
import com.itmuch.cloud.feign.model.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dome
 */
@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    /**
     * 通过id获取用户信息
     *
     * @param id
     * @return
     */
    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);
}
