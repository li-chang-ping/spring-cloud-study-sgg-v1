package com.lcp.springcloud.controller;

import com.lcp.springcloud.entities.Dept;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lcp
 * @date 2020/5/11 21:25
 */
@RestController
@RequestMapping("/consumer")
public class DeptControllerConsumer {

    /**
     * private static final String REST_URL_PREFIX = "http://localhost:8001";
     *
     * SPRING-CLOUD-PROVIDER-DEPT 就是 spring.application.name 的大写，
     * 也就是 Eureka Server 浏览器面板中 Application 下对应的名字
     */
    private static final String REST_URL_PREFIX = "http://SPRING-CLOUD-PROVIDER-DEPT";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @GetMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    @RequestMapping(value = "/dept/discovery")
    public Object discovery() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
}
