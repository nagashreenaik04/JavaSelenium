package day8;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("OrangeHRM, Inc")).click();
		Set<String> windowIDs = driver.getWindowHandles();
		
		/*
		//Approach 1: Convert set into array list 
		//this approach is recommended for the 2 or 3 browsers
		
		List<String> windowList = new ArrayList(windowIDs);
		
		String parentID = windowList.get(0);
		String childID = windowList.get(1);
		
		System.out.println(driver.getTitle());
		
		//switch to child window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		*/
		
		//Approach 2: looping statement
		//when we have multiple browser then we can go with this.
		for(String winID : windowIDs)
		{
			@Nullable
			String title = driver.switchTo().window(winID).getTitle();
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
				//some validation on the parent window
			}
		}

	}

}
