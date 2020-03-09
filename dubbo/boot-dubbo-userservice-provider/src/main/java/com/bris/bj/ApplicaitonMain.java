package com.bris.bj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations="classpath:dubbo-service.xml")
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class ApplicaitonMain {

	public static void main(String[] args) {
		SpringApplication.run(ApplicaitonMain.class, args);
		System.out.println("springboot服务已经启动....");
	}
}
