package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@ComponentScan(basePackages = { "test ", "com.zensarspringbootdemo" })
@OpenAPIDefinition
public class SpringBootDemo2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		System.out.println("shiva");
		SpringApplication.run(SpringBootDemo2Application.class, args);
		System.out.println("siddu");
		System.out.println("Student");
	}

	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
