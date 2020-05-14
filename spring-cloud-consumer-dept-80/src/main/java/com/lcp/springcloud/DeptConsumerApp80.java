package com.lcp.springcloud;

import com.lcp.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author lcp
 * @date 2020/5/11 22:14
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRING-CLOUD-PROVIDER-DEPT",configuration = MySelfRule.class)
public class DeptConsumerApp80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApp80.class, args);
    }
}
