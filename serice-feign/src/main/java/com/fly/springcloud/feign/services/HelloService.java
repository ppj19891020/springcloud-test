package com.fly.springcloud.feign.services;

import com.fly.springcloud.feign.hystrix.HelloServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 描述:
 *
 * @author pangpeijie
 * @create 2018-04-27 15:35
 */
@FeignClient(value = "MICROSERVICE-PROVIDER-HELLO",fallback = HelloServiceImpl.class)
public interface HelloService {

    @RequestMapping(value = "/test")
    String test();

}
