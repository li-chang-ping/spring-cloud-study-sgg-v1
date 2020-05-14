package com.lcp.springcloud.controller;

import com.lcp.springcloud.entities.Dept;
import com.lcp.springcloud.service.DeptClientService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lcp
 * @date 2020/5/11 21:25
 */
@RestController
@RequestMapping("/consumer/dept")
public class DeptControllerConsumer {

    @Resource
    private DeptClientService deptClientService;

    @PostMapping("/add")
    public boolean add(@RequestBody Dept dept) {
        return deptClientService.add(dept);
    }

    @GetMapping(value = "/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.get(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return deptClientService.list();
    }
}
