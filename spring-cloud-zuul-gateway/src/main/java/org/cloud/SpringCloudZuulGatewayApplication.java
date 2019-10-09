package org.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

/**
 * @author lin
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringCloudZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudZuulGatewayApplication.class, args);
	}

}
