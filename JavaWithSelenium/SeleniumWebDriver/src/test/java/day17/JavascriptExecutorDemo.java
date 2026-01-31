package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		driver.findElement(By.id("name")).sendKeys("John"); // this is using normal sendkeys methood
		//we can achieve same thing into using JavascriptExecutor interface
		WebElement inputBox = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver; //Type casting because we used "WebDriver driver" to store the ChromeDriver object
		//if we use ChromeDriver as a variable then no need type casting i.e., 
//		ChromeDriver driver = new ChromeDriver();
//		JavascriptExecutor js = driver;
		
		//alternative of sendkeys method - passing the text to inputbox
		js.executeScript("arguments[0].setAttribute('value','John')", inputBox);

		//when we are using sendkeys and click method. if we get the ElementIntercepted Exception then we can go for this
		
		
		
		//click()
//		driver.findElement(By.id("female")).click();
		
		WebElement radioBtn = driver.findElement(By.id("female"));
		//alternative of the click() - clicking on element
		js.executeScript("arguments[0].click()", radioBtn);
		
		
	}

}
