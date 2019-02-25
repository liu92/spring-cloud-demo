/**
 * Copyright (C), 2018-2019, XXX有限公司
 * FileName: HiController
 * Author:   lin
 * Date:     2019/2/24 20:51
 * Description: 在Web层的controller层，对外暴露一个"/hi"的API接口，通过上面定义的Feign客户端SchedualServiceHi 来消费服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cloud.demo.controller;

import com.cloud.demo.service.SchedualServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈在Web层的controller层，对外暴露一个"/hi"的API接口，
 *  通过上面定义的Feign客户端SchedualServiceHi 来消费服务〉
 *
 * @author lin
 * @create 2019/2/24
 * @since 1.0.0
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceClient schedualServiceClient;

    @GetMapping(value="hi")
    public String sayHi(String name){
        return schedualServiceClient.sayHiFromClientOne(name);
    }
}
