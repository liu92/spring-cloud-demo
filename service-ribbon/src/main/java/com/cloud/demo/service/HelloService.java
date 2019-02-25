/**
 * Copyright (C), 2018-2019, XXX有限公司
 * FileName: HelloService
 * Author:   lin
 * Date:     2019/2/23 15:43
 * Description: 测试类HelloService
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.cloud.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试类HelloService〉
 *
 * @author lin
 * @create 2019/2/23
 * @since 1.0.0
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    public String clientService(String name){
        return restTemplate.getForObject("http://SERVICE-client/hi?name="+name,String.class);
    }
}
