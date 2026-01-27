package day6;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//get()
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle()
		String title = driver.getTitle();
		System.out.println("Title of the current web page is : " + title);
		
		//getCurrentUrl()
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL is : " + currentUrl);

		//getPageSource()
		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		//getWindowHandle()
		String window_id = driver.getWindowHandle();
		System.out.println(window_id);
		
		Thread.sleep(5000);
		//getWindowHandles()
		driver.findElement(By.partialLinkText("Inc")).click(); //this will open the new browser
		Set<String> window_ids = driver.getWindowHandles();
		System.out.println(window_ids);
		for(String x: window_ids)
		{
			System.out.println(x);
		}
		
		driver.quit();
		
	}

}
