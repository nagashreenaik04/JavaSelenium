package day16;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.opencart.com/");
		
		//selenium 3 we can't use the new tab concept. in selenium 4 it is introduced
//		driver.switchTo().newWindow(WindowType.TAB); //opens new tab
		//it will open the new tab and focusing on the new tab window
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.orangehrm.com/");

	}

}
