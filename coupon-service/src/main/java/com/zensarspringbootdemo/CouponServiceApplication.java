package com.zensarspringbootdemo;

import org.springframework.beans.factory.annotation.Value;


import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@EnableEurekaClient
public class CouponServiceApplication {
	@Value("${test.mylanguage}")
	private String language;

	public static void main(String[] args) {
		SpringApplication.run(CouponServiceApplication.class, args);
		System.out.println("CouponService");
		
	}
	
	//http://localhost:5051/
	@GetMapping("/")
	public String testConfig() {
		return "your language is "+language;
		
	}
}
