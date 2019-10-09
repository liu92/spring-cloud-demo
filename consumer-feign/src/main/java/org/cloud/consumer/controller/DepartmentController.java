package org.cloud.consumer.controller;

import org.cloud.api.po.Department;
import org.cloud.api.service.DepartmentClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: DepartmentController
 * @Description:
 * @Author: lin
 * @Date: 2019/9/30 8:38
 * History:
 * @<version> 1.0
 */
@RestController
public class DepartmentController {

    @Autowired
    private DepartmentClientService departmentClientService;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/consumer/findById/{id}")
    public Department findById(@PathVariable("id") int id){
      return  departmentClientService.findById(id);
    }

    /**
     * 添加
     * @param department
     * @return
     */
    @RequestMapping(value = "/consumer/add")
    public Boolean  add(Department department){
        return  departmentClientService.add(department);
    }

    /**
     * 查询全部
     * @return
     */
    @RequestMapping(value = "/consumer/findAll")
    public List<Department> findAll(){
        return departmentClientService.findAll();
    }
}
