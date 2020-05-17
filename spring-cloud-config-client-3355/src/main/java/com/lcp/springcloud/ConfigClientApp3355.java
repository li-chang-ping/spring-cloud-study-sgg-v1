package com.lcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcp
 * @date 2020/5/17 16:29
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientApp3355 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApp3355.class, args);
    }
}
