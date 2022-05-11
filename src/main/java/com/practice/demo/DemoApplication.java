package com.practice.demo;

import com.practice.demo.Repositories.UserRepository;
import com.practice.demo.controller.UserController;
import com.practice.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages= "com.practice")
public class DemoApplication {
	@Autowired
	UserController controller;

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

	}



}
