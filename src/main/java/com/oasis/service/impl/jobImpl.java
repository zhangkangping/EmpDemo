package com.oasis.service.impl;

import com.oasis.common.Result;
import com.oasis.dao.JobDao;
import com.oasis.dao.pojo.Job;
import com.oasis.service.iservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("jobService")
public class jobImpl implements JobService {
    @Autowired
    JobDao jobDao;
    @Override
    public String save(Job job) {
        int result = jobDao.insertSelective(job);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String delete(Integer jno) {
        int result = jobDao.deleteByPrimaryKey(jno);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public String update(Job job) {
        int result = jobDao.updateByPrimaryKey(job);
        return result>0? Result.SUCCESS:Result.ERROR;
    }

    @Override
    public Job findById(Integer jno) {
        return jobDao.selectByPrimaryKey(jno);
    }

    @Override
    public List<Job> findByPage(Integer page, Integer size) {
        return jobDao.findByPage(page,size);
    }

    @Override
    public List<Job> findByName(String jname) {
        return jobDao.findByName(jname);
    }

    @Override
    public List<Job> findByType(String jtype) {
        return jobDao.findByType(jtype);
    }
}
