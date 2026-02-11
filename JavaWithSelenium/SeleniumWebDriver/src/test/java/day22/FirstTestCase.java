package day22;

import org.testng.annotations.Test;

/*
 * 1)Open app
 * 2)login 
 * 3)logout 
 */

public class FirstTestCase {
	
	@Test(priority=0)
	void openapp(){
		System.out.println("Opening application");
	}
	
	@Test(priority=1)
	void login(){
		System.out.println("login to application...");
	}
	
	@Test(priority=2)
	void logout(){
		System.out.println("Logout from application...");
	}

}
