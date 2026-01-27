package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("testing...");
		
		//1) Lunch the Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//2) Open URL https://demo.opencart.com/
		driver.get("https://demo.opencart.com/");
		
		//3) Validate title should be "Your Store"
		String act_title = driver.getTitle();
		if(act_title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		//4) Close Browser
		driver.close();
		//driver.quit()

	}

}
