package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//without passing username and password
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		
		//with passing username and password
		//https://username:password@the-internet.herokuapp.com/basic_auth
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(2000);
		
		
		//Assignments
		//1) testautmationpractice > checkboxes
		//2) https://mail.rediff.com/cgi-bin/login.cgi > click Login button and handle the alert
		
		
	}

}
