package com.sameer.fullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class UserCompanyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserCompanyServerApplication.class, args);
	}

}
