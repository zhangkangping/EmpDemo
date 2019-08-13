package com.oasis.service.iservice;

import com.oasis.dao.pojo.Dept;

import java.util.List;

public interface DeptService {
    String save(Dept dept);
    String delete(Integer dno);
    String update(Dept dept);
    Dept findById(Integer dno);
    List<Dept> findByName(String dname);
    List<Dept> findByType(String dtype);
}
