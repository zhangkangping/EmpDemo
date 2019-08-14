package com.oasis.service.iservice;

import com.oasis.dao.JobDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class JobServiceTest {
    @Autowired
    JobDao jobDao;
    @Test
    public void findByPage() {
    }

    @Test
    public void findByName() {
    }

    @Test
    public void findByType() {
    }
}