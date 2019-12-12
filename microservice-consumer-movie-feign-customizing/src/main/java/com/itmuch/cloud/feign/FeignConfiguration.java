package com.itmuch.cloud.feign;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author dome
 */
@Configuration
public class FeignConfiguration {

    /**
     * 将契约改为feign原声的默认契约。这样就可以使用feign自带的注解了
     *
     * @return 默认feign的契约
     */
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}
