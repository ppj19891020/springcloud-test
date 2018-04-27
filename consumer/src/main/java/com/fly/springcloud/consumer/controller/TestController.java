package com.fly.springcloud.consumer.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 描述:
 * 测试类
 * @author pangpeijie
 * @create 2018-04-26 14:06
 */
@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBack")
    @ResponseBody
    @GetMapping("/hello")
    public String test(){
        return restTemplate.getForObject("http://MICROSERVICE-PROVIDER-HELLO/test",String.class);
    }

    public String fallBack(){
        return "fall back";
    }

}
