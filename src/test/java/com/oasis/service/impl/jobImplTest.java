package com.oasis.service.impl;

import com.oasis.dao.JobDao;
import com.oasis.dao.pojo.Job;
import com.oasis.service.iservice.JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class jobImplTest {
    @Autowired
    JobService jobService;
    @Test
    public void findByPage() {
        System.err.println(jobService.findByPage(1,2));
    }

    @Test
    public void findByName() {
    }

    @Test
    public void findByType() {
    }

    @Test
    public void save(){
        Job job = new Job(102,"pg","shichang");
        jobService.save(job);
    }
}