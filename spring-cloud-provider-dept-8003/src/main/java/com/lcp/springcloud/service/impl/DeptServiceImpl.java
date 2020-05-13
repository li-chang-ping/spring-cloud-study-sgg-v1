package com.lcp.springcloud.service.impl;

import com.lcp.springcloud.dao.DeptDao;
import com.lcp.springcloud.entities.Dept;
import com.lcp.springcloud.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lcp
 * @date 2020/5/11 20:31
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptDao dao;

    @Override
    public boolean add(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return dao.findAll();
    }

}
