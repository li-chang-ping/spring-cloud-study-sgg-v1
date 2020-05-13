package com.lcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcp
 * @date 2020/5/11 22:14
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumerApp80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp80.class, args);
    }
}
