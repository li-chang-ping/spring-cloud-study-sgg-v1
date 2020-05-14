package com.lcp.springcloud.service;

import com.lcp.springcloud.entities.Dept;

import java.util.List;

/**
 * @author lcp
 * @date 2020/5/11 20:28
 */
public interface DeptService {
    boolean add(Dept dept);

    Dept get(Long id);

    List<Dept> list();
}
