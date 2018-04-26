package com.fly.springcloud.consumer.controller;

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

    @ResponseBody
    @GetMapping("/hello")
    public String test(){
        return restTemplate.getForObject("http://MICROSERVICE-PROVIDER-HELLO/test",String.class);
    }

}
