/**
 * Copyright (C), 2018-2019, XXX有限公司
 * FileName: HelloController
 * Author:   lin
 * Date:     2019/2/23 15:45
 * Description: 在controller中用调用HelloService 的方法
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cloud.demo.controller;

import com.cloud.demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈在controller中用调用HelloService 的方法〉
 *
 * @author lin
 * @create 2019/2/23
 * @since 1.0.0
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(String name){
        return  helloService.clientService(name);
    }
}
