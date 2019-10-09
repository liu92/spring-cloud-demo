package org.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author lin
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class SpringCloudConfigClient8001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClient8001Application.class, args);
	}

}
