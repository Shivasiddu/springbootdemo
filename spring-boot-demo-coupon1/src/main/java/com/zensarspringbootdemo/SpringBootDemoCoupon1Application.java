package com.zensarspringbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@ComponentScan
@OpenAPIDefinition
public class SpringBootDemoCoupon1Application {

	public static void main(String[] args) {
		System.out.println("shiva");
		SpringApplication.run(SpringBootDemoCoupon1Application.class, args);
		System.out.println("siddu");
		System.out.println("coupon");
	}

	@Bean
	public ModelMapper getmodelMapper() {
		return new ModelMapper();

	}

}
