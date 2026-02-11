package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://bookss-pwakit.appspot.com/");
		
//		driver.findElement(By.cssSelector("#inpput")).sendKeys("WELCOME"); //NosuchElementException
		
		//Handle shadow dom element
		driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inpput")).sendKeys("WELCOME");
		
		//Shadow dom
		//1.xpath cannot handle shadow dom elements.
		//2.Only CSS can handle shadow dom elements.
		
		

	}

}
