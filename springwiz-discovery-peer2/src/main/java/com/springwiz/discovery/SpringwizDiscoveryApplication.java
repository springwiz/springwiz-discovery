package com.springwiz.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaServer
@ComponentScan("com.springwiz.discovery")
public class SpringwizDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringwizDiscoveryApplication.class, args);
	}
}
