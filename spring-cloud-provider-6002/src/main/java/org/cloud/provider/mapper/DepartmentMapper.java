package org.cloud.provider.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.api.po.Department;

import java.util.List;

/**
 * @ClassName: DepartmentMapper
 * @Description:
 * @Author: lin
 * @Date: 2019/9/29 16:19
 * @History:
 * @<version> 1.0
 */
@Mapper
public interface DepartmentMapper {

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
