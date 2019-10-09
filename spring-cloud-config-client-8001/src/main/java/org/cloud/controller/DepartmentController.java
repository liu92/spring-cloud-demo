package org.cloud.controller;

import org.cloud.api.po.Department;
import org.cloud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: DepartmentController
 * @Description:
 * @Author: lin
 * @Date: 2019/9/29 22:58
 * History:
 * @<version> 1.0
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    /**
     * 根据id
     * @param id
     * @return
     */
    @RequestMapping(value = "/depart/findById/{id}", method = RequestMethod.GET)
    public Department findById(@PathVariable("id") int id){
        Department d = departmentService.findById(id);
        return  d;
    }

    /**
     * 添加
     * @param department
     */
    @RequestMapping(value = "/depart/add", method = RequestMethod.POST)
    public Boolean add(@RequestBody Department department){
        return  departmentService.add(department);
    }

    /**
     * 查询全部
     * @return
     */
    @RequestMapping(value = "/depart/findAll", method = RequestMethod.GET)
    public List<Department> findAll(){
        List<Department> list = departmentService.findAll();
        return  list;
    }



}
