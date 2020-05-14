package com.lcp.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lcp
 * @date 2020/5/14 9:15
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        //Ribbon默认是轮询，这里自定义为随机
        // return new RandomRule();
        // return new RoundRobinRule();
        return new RoundRobinLcp();
    }
}
