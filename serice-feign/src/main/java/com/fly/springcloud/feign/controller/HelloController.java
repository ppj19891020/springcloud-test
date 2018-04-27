package com.fly.springcloud.feign.controller;

import com.fly.springcloud.feign.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author pangpeijie
 * @create 2018-04-27 15:43
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @ResponseBody
    @RequestMapping("/feigntest")
    public String feignTest(){
        return helloService.test();
    }

}
