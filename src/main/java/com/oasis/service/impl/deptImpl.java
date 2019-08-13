package com.oasis.service.impl;

import com.oasis.common.Result;
import com.oasis.dao.DeptDao;
import com.oasis.dao.pojo.Dept;
import com.oasis.service.iservice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class deptImpl implements DeptService {
    @Autowired
    DeptDao deptDao;

    @Override
    public String save(Dept dept) {
       int result = deptDao.insertSelective(dept);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer dno) {
        int result = deptDao.deleteByPrimaryKey(dno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Dept dept) {
        int result = deptDao.updateByPrimaryKey(dept);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public Dept findById(Integer dno) {
        return deptDao.selectByPrimaryKey(dno);
    }

    @Override
    public List<Dept> findByName(String dname) {
        return deptDao.findByName(dname);
    }

    @Override
    public List<Dept> findByType(String dtype) {
        return deptDao.findByType(dtype);
    }
}
