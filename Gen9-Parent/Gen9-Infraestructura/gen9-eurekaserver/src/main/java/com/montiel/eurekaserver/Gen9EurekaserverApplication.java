package com.montiel.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Gen9EurekaserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Gen9EurekaserverApplication.class, args);
	}

}
