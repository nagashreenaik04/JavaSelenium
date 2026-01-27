package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac = driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions act = new Actions(driver);
		
		//Mouse Hover action
//		act.moveToElement(desktops).moveToElement(mac).click().build().perform();
		
		act.moveToElement(desktops).moveToElement(mac).click().perform();
		
		//build()- it will create an action
		//perform()- it will actually perform the action (built an action and complete an action)
		//Diff - when we call the perform method itself is able to built that action. it is capable of building the action
		//calling build() is optional. it is not mandatory //older version (i.e., 2, 3 we have build() but later on we stopped to use build()
		

	}

}
