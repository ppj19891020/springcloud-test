package com.fly.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 *
 * @author pangpeijie
 * @create 2018-04-26 10:29
 */
@RestController
public class TestController {

    @ResponseBody
    @GetMapping("/test")
    public String test(){
        return "json";
    }

}
