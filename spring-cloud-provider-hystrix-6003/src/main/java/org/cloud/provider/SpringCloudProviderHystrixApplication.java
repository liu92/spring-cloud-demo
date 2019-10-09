package org.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lin
 *
 * @EnableCircuitBreaker // 对hystrix熔断机制的支持
   @EnableEurekaClient  //启动服务后将自动注册到eureka服务中心去
   @EnableDiscoveryClient  // 服务发现
 */
@SpringBootApplication
@EnableCircuitBreaker
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringCloudProviderHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderHystrixApplication.class, args);
	}

}
