package com.zensar.messageapi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.zensar.messageapi.entity.ZensarUser;
import com.zensar.messageapi.security.jwt.util.JWTUtil;

@RestController
public class AuthenticationRestController {

	@Autowired
	private JWTUtil util;

	@Autowired
	private AuthenticationManager manager;

	// This method is used to do user authentication using username, password passed by user
	@PostMapping("/api/authenticate")
	public ResponseEntity<String> authenticate(@RequestBody ZensarUser user)
	{
		System.out.println("In Authenticate");
		// 1 - Check if this user exists in DB
		UsernamePasswordAuthenticationToken authenticationToken;
		authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(), 
				user.getPassword(),		
				AuthorityUtils.createAuthorityList("ROLE_USER"));
		try 
		{
			// This authenticates user. If user is not authenticated throws exceptions
			manager.authenticate(authenticationToken);

			// 2 - If user exists generate token
			String token = util.genetateToken(user.getUserName());
			ResponseEntity<String> entity = new ResponseEntity<String>(token, HttpStatus.OK);
			return entity;
		} 
		catch (Exception e) 
		{
			// User is not Authenticated
			ResponseEntity<String> entity = new ResponseEntity<String>("Not Authenticated", HttpStatus.UNAUTHORIZED);
			return entity;
		}		
	}
}