package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Inc")).click(); //this will open the new browser
		
		
		//driver.close();// close single browser window where ever driver is focused 
		driver.quit();//close all browser windows
		
		//https://testautomationpractice.blogspot.com/ -practice
		

	}

}
