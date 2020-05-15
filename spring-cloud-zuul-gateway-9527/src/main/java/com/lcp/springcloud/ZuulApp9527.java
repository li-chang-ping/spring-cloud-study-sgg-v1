package com.lcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author lcp
 * @date 2020/5/15 15:26
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApp9527.class, args);
    }
}