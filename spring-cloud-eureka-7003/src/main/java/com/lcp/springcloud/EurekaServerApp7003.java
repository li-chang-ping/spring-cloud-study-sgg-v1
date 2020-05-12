package com.lcp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lcp
 * @date 2020/5/12 10:01
 * <p>
 * EurekaServer服务器端启动类,接受其它微服务注册进来
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp7003 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp7003.class, args);
    }
}
