package com.lcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lcp
 * @date 2020/5/11 20:36
 *
 * {@code @EnableEurekaClient} 表示这是一个 Eureka 客户端，服务启动后会自动注册到 Eureka Server
 * {@code @EnableDiscoveryClient} 开启服务发现
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProviderApp8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderApp8001.class, args);
    }
}
