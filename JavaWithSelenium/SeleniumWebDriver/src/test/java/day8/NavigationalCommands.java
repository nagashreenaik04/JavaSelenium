package day8;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://www.nopcommerce.com/"); //accept url only in the String format
		driver.navigate().to("https://www.nopcommerce.com/"); //accept url in the String format
		
//		URL myUrl = new URL("https://www.nopcommerce.com/");
//		driver.navigate().to(myUrl); //accept url in the URL format
		
		//navigate.to()
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//back()
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		
		//forward()
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		//refresh()
		driver.navigate().refresh();
		

	}

}
