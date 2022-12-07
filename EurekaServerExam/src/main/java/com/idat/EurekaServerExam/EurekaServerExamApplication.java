package com.idat.EurekaServerExam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerExamApplication.class, args);
	}

}
