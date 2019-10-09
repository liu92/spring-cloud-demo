package org.cloud.controller;

import org.cloud.api.po.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-PROVIDER";


    /**
     * 如果不 配置 RestTemplateConfig那么在 容器中就没有这个bean
     * Field restTemplate in org.cloud.consumer.controller.DepartmentController
     * required a bean of type 'org.springframework.web.client.RestTemplate' that could not be found.
     */
    @Autowired
    private RestTemplate restTemplate;


    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping(value = "/consumer/findById/{id}")
    public Department findById(@PathVariable("id") int id){
       return   restTemplate.getForObject(REST_URL_PREFIX + "/depart/findById/" + id, Department.class);
    }

    /**
     * 添加
     * @param department
     * @return
     */
    @RequestMapping(value = "/consumer/add")
    public Boolean  add(Department department){
        Boolean object = restTemplate.postForObject(REST_URL_PREFIX + "/depart/add", department, Boolean.class);
        return  object;
    }

    /**
     * 查询全部
     * @return
     */
    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/findAll")
    public List<Department> findAll(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/depart/findAll", List.class);
    }
}
