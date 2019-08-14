package com.oasis.action.job;

import com.oasis.common.ReponseResult;

import com.oasis.common.Result;
import com.oasis.dao.pojo.Job;
import com.oasis.service.iservice.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.List;

@Controller
public class jobAction {
    @Autowired
    JobService jobService;

    @RequestMapping(value = "jobsave",method = RequestMethod.POST)
    public @ResponseBody ReponseResult<Job> save(Job job){
        String msg = jobService.save(job);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ReponseResult<Job>(code,msg);
    }

    @RequestMapping(value = "jobdelete/{jno}",method = RequestMethod.DELETE)
    public @ResponseBody ReponseResult<Job> delete(@PathVariable Integer jno){
        String msg = jobService.delete(jno);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ReponseResult<Job>(code,msg);
    }

    @RequestMapping(value = "jobupdate",method = RequestMethod.POST)
    public @ResponseBody ReponseResult<Job> update(Job jno){
        String msg= jobService.update(jno);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ReponseResult<Job>(code,msg);
    }

    @RequestMapping(value = "findByPage")
    public @ResponseBody ReponseResult<List<Job>> findByPage(
            @RequestParam(value = "page",required = false,defaultValue = "1") Integer page,
            @RequestParam(value = "size",required = false,defaultValue = "3") Integer size){
        List<Job> emps = jobService.findByPage(page,size);
        if (emps!=null&&emps.size()>0){
            return new ReponseResult<List<Job>>(200,Result.SUCCESS,emps);
        }else {
            return new ReponseResult<List<Job>>(404,Result.ERROR);
        }
    }

    @RequestMapping(value = "findById/{jno}")
    public @ResponseBody ReponseResult<Job> findById(@PathVariable("jno") Integer jno){
        Job jobs = jobService.findById(jno);
        if(jobs!=null){
            return  new ReponseResult<Job>(200,Result.SUCCESS,jobs);
        }else{
            return new ReponseResult<Job>(404,Result.ERROR);
        }
    }

    @RequestMapping(value = "findByName/{jname}")
    public @ResponseBody ReponseResult<List<Job>> findByName(@PathVariable("jname") String jname){
        List<Job> jobs = jobService.findByName(jname);
        if(jobs!=null&jobs.size()>0){
            return  new ReponseResult<List<Job>>(200,Result.SUCCESS,jobs);
        }else{
            return new ReponseResult<List<Job>>(404,Result.ERROR);
        }
    }

    @RequestMapping(value = "findByType/{jtype}")
    public @ResponseBody ReponseResult<List<Job>> findByType(@PathVariable("jtype") String jtype){
        List<Job> jobs = jobService.findByType(jtype);
        if(jobs!=null&jobs.size()>0){
            return new ReponseResult<List<Job>>(200,Result.SUCCESS,jobs);
        }else {
            return new ReponseResult<List<Job>>(404,Result.ERROR);
        }
    }
}
