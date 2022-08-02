package com.zensar.messageapi.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import com.zensar.messageapi.security.service.impl.ZensarUserServiceImpl;

@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private ZensarUserServiceImpl userZensarService;
	
	@Bean // This will declare return object as Spring Bean
	public BCryptPasswordEncoder getBCryptPasswordEncoder() {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		return passwordEncoder;
	}

	// Authentication : is the process of determining someone is who it says
	// (Claims) to be
	// It is typically implemented by username and password
	// conf Enter
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth
			.userDetailsService(userZensarService)
			.passwordEncoder(getBCryptPasswordEncoder());
	}
	
	// Authorization: - specifying access rights to a resource
	// A document giving official permission.
	// Access based on Roles
	// What are you allowed to do?
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
			.csrf()
			.disable()
			.authorizeRequests()
			// we are allowing only admin to access 
			.antMatchers(HttpMethod.POST, "/api/message").hasRole("ADMIN") 
			.anyRequest()
			.authenticated()
			.and()
			.httpBasic()
				// This tells basic Authentication
			.and()
			.sessionManagement()
			.sessionCreationPolicy(SessionCreationPolicy.STATELESS); // REST is STATELESS
	}
}