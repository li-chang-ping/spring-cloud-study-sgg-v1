package com.lcp.springcloud.controller;

import com.lcp.springcloud.entities.Dept;
import com.lcp.springcloud.service.DeptService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lcp
 * @date 2020/5/11 20:34
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private DeptService service;

    @Resource
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }

    @GetMapping(value = "/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        System.out.println("*********" + services);

        List<ServiceInstance> srvList = discoveryClient.getInstances("PROVIDER-DEPT-8001");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.discoveryClient;
    }
}
