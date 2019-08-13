package com.oasis.service.iservice;



import com.oasis.dao.pojo.Job;

import java.util.List;

public interface JobService {
    String save(Job job);
    String delete(Integer jno);
    String update(Job job);
    Job findById(Integer jno);
    List<Job> findByName(String jname);
    List<Job> findByType(String jtype);
}
