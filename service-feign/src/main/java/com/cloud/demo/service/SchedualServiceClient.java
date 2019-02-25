package com.cloud.demo.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能描述: <br>
 * 〈〉
 *  定义一个feign接口，通过@ FeignClient（“服务名”）
 * @return:
 * @since: 1.0.0
 * @Author:lin
 * @Date: 2019/2/24 20:30
 */

@FeignClient(value = "service-hi")
public interface SchedualServiceClient {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
