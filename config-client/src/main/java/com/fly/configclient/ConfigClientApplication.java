package com.fly.configclient;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 描述:
 *
 * @author pangpeijie
 * @create 2018-05-08 10:23
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConfigClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class,args);
    }

    @Value("${testValue}")
    private String testValue;


    @PostConstruct
    public void show() {
        System.out.println("testValue=" + testValue);
    }

}
