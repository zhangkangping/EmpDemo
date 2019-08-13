package com.oasis.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:spring-datasource.xml"})
public class DeptDaoTest {
    @Autowired
    DeptDao deptDao;
    @Test
    public void deleteByPrimaryKey() {

        deptDao.deleteByPrimaryKey(1);

    }

    @Test
    public void findByName() {

    }

    @Test
    public void findByType() {
    }

    @Test
    public void selectByPrimaryKey() {
        System.err.println(deptDao.selectByPrimaryKey(1));
    }
}