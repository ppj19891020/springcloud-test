package com.fly.springcloud.feign.hystrix;

import com.fly.springcloud.feign.services.HelloService;
import org.springframework.stereotype.Component;

/**
 * 描述:
 *
 * @author pangpeijie
 * @create 2018-04-27 16:13
 */
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String test() {
        return "hystrix fall back";
    }
}
