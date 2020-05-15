package com.lcp.springcloud.service.impl;

import com.lcp.springcloud.entities.Dept;
import com.lcp.springcloud.service.DeptClientService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lcp
 * @date 2020/5/15 14:04
 */
@Component
public class DeptClientServiceImpl implements DeptClientService {
    @Override
    public Dept get(long id) {
        return new Dept().setDeptno(id)
                .setDname("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭，信息来自：DeptClientServiceImpl")
                .setDb_source("no this database in MySQL");
    }

    @Override
    public List<Dept> list() {
        return null;
    }

    @Override
    public boolean add(Dept dept) {
        return false;
    }
}
