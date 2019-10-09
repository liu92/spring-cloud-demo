package org.cloud.api.service;

import org.cloud.api.po.Department;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @ClassName: DepartmentService
 * @Description:
 * @Author: lin
 * @Date: 2019/10/4 17:20
 * History:
 * @<version> 1.0
 *
 * fallbackFactory 这个接口中如果出了问题，全部去找fallbackFactory来同一处理
 */
//@FeignClient(value = "MICROSERVICECLOUD-PROVIDER")
@FeignClient(value = "MICROSERVICECLOUD-PROVIDER",fallbackFactory = DepartmentClientFallbackFactory.class)
public interface DepartmentClientService {

    /**
     * 根据id
     * @param id
     * @return
     */
    @RequestMapping(value = "/depart/findById/{id}", method = RequestMethod.GET)
    Department findById(@PathVariable("id") int id);

    /**
     * 添加
     * @param department
     * @return false
     */
    @RequestMapping(value = "/depart/add", method = RequestMethod.POST)
    Boolean add(Department department);

    /**
     * 查询全部
     * @return
     */
    @RequestMapping(value = "/depart/findAll", method = RequestMethod.GET)
    List<Department> findAll();
}
