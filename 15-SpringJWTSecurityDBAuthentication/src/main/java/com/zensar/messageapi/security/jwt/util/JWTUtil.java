package com.zensar.messageapi.security.jwt.util;

import java.util.Date;
import org.springframework.stereotype.Component;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

@Component
public class JWTUtil {
	
	// This method is used to generate token for a username
	// To generate token we will be using library java jwt
	public String genetateToken(String username) {
		String jwtToken = JWT.create()
				.withClaim("name", username) // playload
				.withExpiresAt(new Date(System.currentTimeMillis()+16000))
				.sign(Algorithm.HMAC512("zensarsecret")); // Header + Signature
		
		// System.out.println(jwtToken);
		
		// we have created jwt token
		return jwtToken;						
	}
	
	public void validateToken(String token) {
		JWT.require(Algorithm.HMAC512("zensarsecret")).build().verify(token);
	}
}