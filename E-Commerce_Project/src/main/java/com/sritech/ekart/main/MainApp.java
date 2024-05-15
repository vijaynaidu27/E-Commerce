package com.sritech.ekart.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.sritech.ekart")
@EnableJpaRepositories("com.sritech.ekart.repository")
@EntityScan("com.sritech.ekart.entity")
public class MainApp  extends SpringBootServletInitializer{
	
	public static void main(String[] args) {
		
		System.out.println("Main app started ");
		
		SpringApplication.run(MainApp.class, args);
		
	}
}
