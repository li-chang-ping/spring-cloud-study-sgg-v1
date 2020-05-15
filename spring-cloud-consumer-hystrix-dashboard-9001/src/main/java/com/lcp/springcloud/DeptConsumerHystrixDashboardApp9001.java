package com.lcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author lcp
 * @date 2020/5/15 10:22
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class DeptConsumerHystrixDashboardApp9001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerHystrixDashboardApp9001.class, args);
    }
}
