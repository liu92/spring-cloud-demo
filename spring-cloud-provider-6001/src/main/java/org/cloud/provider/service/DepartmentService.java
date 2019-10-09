package org.cloud.provider.service;

import org.cloud.api.po.Department;

import java.util.List;

/**
 * @ClassName: DepartmentService
 * @Description:
 * @Author: lin
 * @Date: 2019/9/29 16:35
 * @History:
 * @<version> 1.0
 */
public interface DepartmentService {
    /**
     * 根据id
     * @param id
     * @return
     */
    Department findById(int id);

    /**
     * 添加
     * @param department
     */
    Boolean add(Department department);

    /**
     * 查询全部
     * @return
     */
    List<Department> findAll();
}
