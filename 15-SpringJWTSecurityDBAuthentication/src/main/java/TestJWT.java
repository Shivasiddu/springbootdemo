import java.util.Scanner;

import com.zensar.messageapi.security.jwt.util.JWTUtil;

public class TestJWT {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		JWTUtil util = new JWTUtil();
		// System.out.println(util.genetateToken("zensar"));
		
		String token = util.genetateToken("zensar");
		new Scanner(System.in).next(); 
		// This is to make sure programs halts
		// So that time expires and token becomes invalid
		// To test expiration time test
		
		try {
			util.validateToken(token);
			// util.vaidateToken(token+"s");
			System.out.println("Token is Vallid");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Token is Invalid");
		}
	}

}