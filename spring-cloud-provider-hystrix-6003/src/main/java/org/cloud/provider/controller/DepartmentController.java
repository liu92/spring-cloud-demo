package org.cloud.provider.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.cloud.api.po.Department;
import org.cloud.provider.service.DepartmentService;
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
     *
     *  @HystrixCommand 这个注解放在这里需要考虑两个问题，
     *  1、如果有多个方法，那么需要写多个 @HystrixCommand 注解来进行处理，会产生很多方法
     *  2、在spring中 有aop的思想，但是这里主干的业务逻辑和处理异常的切面整合在一块了，造成了高度的耦合， 织入（前置通知，后置通知，环绕通知，异常通知）
     *  这里其实就是异常通知。所以最后就是业务方法和异常处理不耦合在一块，应该还是 业务主逻辑方法。 所以借鉴这种思想来完成新的内容，实现解耦合分离，避免方法膨胀。
     */
    @RequestMapping(value = "/depart/findById/{id}", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Department findById(@PathVariable("id") int id){
        Department d = departmentService.findById(id);
        if(null == d){
            throw  new RuntimeException("该ID: "+id+"没有对应的信息");
        }
        return  d;
    }


    private Department processHystrixGet(@PathVariable("id") int id)
    {
        return new Department().setId(id)
                .setDepartmentName("该ID："+id+"没有没有对应的信息,null--@HystrixCommand");
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
