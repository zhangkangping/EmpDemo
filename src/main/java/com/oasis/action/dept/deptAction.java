package com.oasis.action.dept;

import com.oasis.common.ReponseResult;
import com.oasis.common.Result;
import com.oasis.dao.pojo.Dept;
import com.oasis.service.iservice.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class deptAction {
    @Autowired
    DeptService deptService;

    @RequestMapping("deptSave.do")
    @ResponseBody
    public ReponseResult<Dept> save(Dept dept){
        String msg = deptService.save(dept);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ReponseResult<Dept>(code,msg);
    }

    @RequestMapping("deptDelete.do")
    @ResponseBody
    public  ReponseResult<Dept> delete(Integer dno){
        String msg = deptService.delete(dno);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ReponseResult<Dept>(code,msg);
    }

    @RequestMapping("deptUpdate.do")
    @ResponseBody
    public ReponseResult<Dept> update(Dept dept){
        String msg = deptService.update(dept);
        int code = Result.SUCCESS.equals(msg)?200:404;
        return new ReponseResult<Dept>(code,msg);
    }


    @RequestMapping("deptFindById.do")
    @ResponseBody
    public  ReponseResult<Dept> findById(Integer dno){
        Dept depts = deptService.findById(dno);
        if (depts!=null){
            return new ReponseResult<Dept>(200, Result.SUCCESS,depts);
        }else {
            return new ReponseResult<Dept>(404,Result.ERROR);
        }
    }

    @RequestMapping("deptFindByName.do")
    @ResponseBody
    public  ReponseResult<List<Dept>> findByName(String dname){
        List<Dept> depts = deptService.findByName(dname);
        if (depts!=null&&depts.size()>0){
            return new ReponseResult<List<Dept>>(200,Result.SUCCESS,depts);
        }else {
            return new ReponseResult<List<Dept>>(404,Result.ERROR);
        }
    }

    @RequestMapping("deptfindByType.do")
    @ResponseBody
    public ReponseResult<List<Dept>> findByType( String dtype){
        List<Dept> depts = deptService.findByType(dtype);
        if (depts!=null&&depts.size()>0){
            return new ReponseResult<List<Dept>>(200,Result.SUCCESS,depts);
        }else {
            return new ReponseResult<List<Dept>>(404,Result.ERROR);
        }
    }

}
