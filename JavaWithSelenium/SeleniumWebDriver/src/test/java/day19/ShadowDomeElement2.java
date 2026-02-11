package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomeElement2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://practice.expandtesting.com/shadowdom");
		
		String button1 = driver.findElement(By.cssSelector("#my-btn")).getText();
		System.out.println("Button1 text is : " +button1);
		
		//button2 is in shadow DOM, so
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
		Thread.sleep(1000); //need the time because line should execute by line by line. so avoid conflict we need to add the Thread.
		String button2 = shadow.findElement(By.cssSelector("#my-btn")).getText();
		System.out.println("Button2 text is : " +button2);
	}

}
