package com.info;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author olive
 * @date 2017-07-08
 */
@SpringCloudApplication // 这个注解整合了@SpringBootApplication、@EnableDiscoveryClient、@EnableCircuitBreake
@EnableZuulProxy
public class ZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApplication.class, args);
	}

	@Bean
	public MyZuulFilter getZuulFilter() {
		return new MyZuulFilter();
	}
}
