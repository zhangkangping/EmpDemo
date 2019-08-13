package com.oasis.service.impl;

import com.oasis.dao.pojo.Dept;
import com.oasis.service.iservice.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class deptImplTest {
    @Autowired
    DeptService deptService;
    @Test
    public void save() {
    }

    @Test
    public void delete() {

    }

    @Test
    public void update() {
    }

    @Test
    public void findById() {
        System.err.println(deptService.findById(1));
    }

    @Test
    public void findByName() {
        List<Dept> depts = deptService.findByName("人事部");
        for(Dept dept:depts){
            System.err.println(dept);
        }

    }

    @Test
    public void findByType() {

    }
}