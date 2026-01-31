package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//1) scroll down page by pixel number
		js.executeScript("window.scrollBy(0,3000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;")); //3000
		
		//2) scroll the page till element is displayed
		//go to till element
		WebElement ele = driver.findElement(By.xpath("//td[normalize-space(.)='G']"));
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;")); //6189
		
		//3) scroll down till end of the page
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); //9643
		
		//4) scrolling up to initially position
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); //0
		
		//this above scrolling is for the Vertical lines 
		//if we are performing action on the Horizontal lines then we need to use "scrollWidth" instead of scrollHeight
		
		
		

	}

}
