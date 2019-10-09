package org.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lin
 *
 * @EnableFeignClients(basePackages= {"org.cloud.api"}) 这个注解是用来指定@FeignClient注解的地方
   @ComponentScan("org.cloud")  这个是用扫描 本项目的controller 的,其实这里 可以用加该注解
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"org.cloud.api"})
@ComponentScan("org.cloud")
public class ConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerFeignApplication.class, args);
	}

}
