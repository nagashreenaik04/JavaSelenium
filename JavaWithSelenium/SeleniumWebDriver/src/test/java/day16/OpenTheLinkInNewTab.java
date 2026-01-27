package day16;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenTheLinkInNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement regLink = driver.findElement(By.xpath("//a[normalize-space(.)='Register']"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(regLink).keyUp(Keys.CONTROL).perform();
		//after opening the registration page, driver is still focusing on the home page.
		
		//switching to registration page
		Set<String> ids = driver.getWindowHandles();
		//convert into ArrayList
//		List<String> ids = new ArrayList(driver.getWindowHandles());
		List<String> id = new  ArrayList(ids);
		
		
		
//		System.out.println(id.get(1));
		//Registration page
		driver.switchTo().window(id.get(1)); //switch to registration page
		Thread.sleep(5000);
		
		//Home page
		driver.switchTo().window(id.get(0)); //switch to home page
	}

}
