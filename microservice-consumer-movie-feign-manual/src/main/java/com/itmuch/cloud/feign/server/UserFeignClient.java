package com.itmuch.cloud.feign.server;

import com.itmuch.cloud.feign.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author dome
 */
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
