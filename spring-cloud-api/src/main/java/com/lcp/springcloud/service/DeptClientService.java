package com.lcp.springcloud.service;

import com.lcp.springcloud.entities.Dept;
import com.lcp.springcloud.service.fallback.DeptClientServiceFallbackFactory;
import com.lcp.springcloud.service.impl.DeptClientServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author lcp
 * @date 2020/5/14 14:53
 * <p>
 * {@code @FeignClient(value = "SPRING-CLOUD-PROVIDER-DEPT",
 * fallbackFactory = DeptClientServiceFallbackFactory.class)}
 */
@FeignClient(value = "SPRING-CLOUD-PROVIDER-DEPT",
        fallback = DeptClientServiceImpl.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(Dept dept);
}
