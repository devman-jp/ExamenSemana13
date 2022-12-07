package com.idat.ConfigServerExam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigServerExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerExamApplication.class, args);
	}

}
