package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages = "com.example.demo.*")

public class LimitLessEstate1Application {

	public static void main(String[] args) {
		SpringApplication.run(LimitLessEstate1Application.class, args);
	}

}
