package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepCommand {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(2000); //pause the execution
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//NoSuchElementException: Element not present on the page. Synchronization
		//ElementNotFoundException: Locator is not correct.
		

	}

}
