Http Status Code

200			OK

401			UNAUTHORIZED (Username, Password not sent Or Not Correct)

403			Forbidden (authenticated but not allowed to access a resource)

This Project uses DB Authentication

Steps for applying Spring security
----------------------------------

1) To add dependency in pom.xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-security</artifactId>
</dependency>

By default one user with username: user
and password : displayed on console : f60a6676-49d5-45b6-b192-47b987c042eb

Problem ?
	Every time you run application new password is generated
	
Above is the default behaviour (functionality) we are getting from Spring security

We want to give custom username and password

2) To write configuration class

Spring security is giving implicit support for an attack know as -CSRF : (cross site request forgery)
POST request doesn't work
So we need to do additional configuration as follows - 

----------------------------------------------------------

JWT

JWT - stands for json web token.
JWT consists of three parts.
Header.payload.signature.
Header - consist of algorithm used to generate the token.
payload - it consists of claims. claim is additional data about user entity
			eg: username, expiration time etc.
			
signature - it is typically secret key (String which is know only to server to validate the token)
 
 
 eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9 --> Header
 eyJuYW1lIjoiemVuc2FyIiwiZXhwIjoxNjUzODk0Nzk0fQ --> Playload
 SVahFouDOy5vSauWQ5jJkYBS2Z4IPB2BOSf7Tuxh0_W_lI3p5ozY-tCZGwvV20h2PKFysliuGnuiKGdGVt9YHA --> Signature