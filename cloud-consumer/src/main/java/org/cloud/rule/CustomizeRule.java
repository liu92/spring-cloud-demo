package org.cloud.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: CustomizeRule
 * @Description:
 * @Author: lin
 * @Date: 2019/9/30 23:28
 * History:
 * @<version> 1.0
 */
@Configuration
public class CustomizeRule {

    @Bean
    public IRule myRule(){
        return  new RandomRule();
    }
}
