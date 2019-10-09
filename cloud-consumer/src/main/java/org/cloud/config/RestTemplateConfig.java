package org.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RestTemplateConfig
 * @Description:
 * @Author: lin
 * @Date: 2019/9/30 9:39
 * History:
 * @<version> 1.0
 */
@Configuration
public class RestTemplateConfig {


    /**
     * Field restTemplate in org.cloud.consumer.controller.DepartmentController
     * required a bean of type 'org.springframework.web.client.RestTemplate' that could not be found.
     *
     * Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端   负载均衡的工具。
     * @return
     */

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 修改 负载均衡算法
    @Bean
    public IRule myRule(){
      return  new RandomRule();
    }
    */

    /**
     * 如果要实现自动负载均衡算法那么
     * 在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效，形如：
     @RibbonClient(name="MICROSERVICECLOUD-PROVIDER",configuration=MySelfRule.class)
     */
}
