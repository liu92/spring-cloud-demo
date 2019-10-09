package org.cloud.service.impl;

import org.cloud.api.po.Department;
import org.cloud.mapper.DepartmentMapper;
import org.cloud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DepartmentServiceImpl
 * @Description:
 * @Author: lin
 * @Date: 2019/9/29 16:36
 * History:
 * @<version> 1.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    /**
     * 根据id
     *
     * @param id
     * @return
     */
    @Override
    public Department findById(int id) {
        return departmentMapper.findById(id);
    }

    /**
     * 添加
     *
     * @param department
     */
    @Override
    public Boolean add(Department department) {
        return  departmentMapper.add(department);
    }

    /**
     * 查询全部
     *
     * @return
     */
    @Override
    public List<Department> findAll() {
        return departmentMapper.findAll();
    }
}
