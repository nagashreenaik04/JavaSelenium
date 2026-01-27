package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id 
		boolean logo_displayed_status = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logo_displayed_status);
		
		//linktext and partial linktext
		//driver.findElement(By.linkText("Tablets")).click();
		driver.findElement(By.partialLinkText("Tablet")).click();
		
		//class name
		List<WebElement> header_links = driver.findElements(By.className("list-inline-item"));
		System.out.println("Total number of header links : " + header_links.size());
		
		//tagname
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " + links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images : " + images.size());
		
		//https://demoblaze.com/ total number link/imges
		
	}

}
