package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.id("menu-item-7091")).click(); //open dropdown options
		
		//1) select single options
//		driver.findElement(By.id("menu-item-7102")).click();
		
//		//2) capture all the options and find out the size
//		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'sub-menu toggled-on')]//li"));
//		System.out.println(options.size());
//		
//		//3) printing option from dropdown
//		for(WebElement opt : options) {
//			System.out.println(opt.getText());
//		}
		
		
		
	}

}
