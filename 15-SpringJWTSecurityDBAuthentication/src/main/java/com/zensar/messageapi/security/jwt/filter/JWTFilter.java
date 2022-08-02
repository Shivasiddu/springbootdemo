package com.zensar.messageapi.security.jwt.filter;

import java.io.IOException;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import com.zensar.messageapi.security.jwt.util.JWTUtil;

// Any request sent will be handled by this filter
// This class is used to fetch token and check if it is valid
public class JWTFilter extends BasicAuthenticationFilter {

	public JWTFilter(AuthenticationManager authenticationManager) {
		super(authenticationManager);
	}

	// doF (ctrl + space)
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// super.doFilterInternal(request, response, chain);

		System.out.println("In doFilterInternal");
		// Bearer token
		// eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJuYW1lIjoiemVuc2FyIiwiZXhwIjoxNjUzOTY5ODAyfQ.YAfQMf7UivPOQ1q6iTUaRceSrX2MZQd0VXEyv-VS_I1LMnXRUx88BJn-UdyhrBLACBFcQgrmh-DtcbyLhxL8Uw
		// 1 fetch the token from user request
		String authorizationHeaderValue = request.getHeader("Authorization");
		if(authorizationHeaderValue != null)
		{
			String token = authorizationHeaderValue.substring(7);

			// 2 validate the token
			JWTUtil util = new JWTUtil();
			try {
				util.validateToken(token);
				// 3 it valid allow user to access resource
				UsernamePasswordAuthenticationToken authenticationToken;
				authenticationToken = new UsernamePasswordAuthenticationToken("zensar", null, 
						AuthorityUtils.createAuthorityList("ROLE_USER"));

				// Following line Authenticate user
				SecurityContextHolder.getContext().setAuthentication(authenticationToken);
			} catch (Exception e) {
				// 4 it is not valid don't allow user
				e.printStackTrace();
				throw e;
			}
		}
		// Calling doFilter method is must so that next filter in chain will execute
		chain.doFilter(request, response);
	}

}