package day18;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableAutomatedMessageOnScreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//to remove "Chrome is being controlled by automated test software" text in the browser
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String act_title = driver.getTitle();
		
		if(act_title.equals("OrangeHRM"))
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}


	}

}
