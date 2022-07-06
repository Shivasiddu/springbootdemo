package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "test ", "com.zensarspringbootdemo" })

public class SpringBootDemoProductApplication {

	public static void main(String[] args) {
		System.out.println("shiva");
		SpringApplication.run(SpringBootDemoProductApplication.class, args);
		System.out.println("siddu");
		System.out.println("Product");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
