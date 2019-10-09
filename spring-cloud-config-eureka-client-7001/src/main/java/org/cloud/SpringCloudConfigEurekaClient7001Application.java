package org.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author lin
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudConfigEurekaClient7001Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigEurekaClient7001Application.class, args);
	}

}
