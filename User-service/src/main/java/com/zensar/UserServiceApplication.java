package com.zensar;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		
		System.out.println("User Service Running Successfully...!!!!!");
	}
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
}
