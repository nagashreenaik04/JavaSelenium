package day9;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//Handle Alerts without using switchTo().alert()
//By using explicit wait
public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10)); //explicit wait declaration
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		
		Alert myalert = myWait.until(ExpectedConditions.alertIsPresent());
		System.out.println(myalert.getText());  //I am a JS Alert
		myalert.accept();
		
		
		
	
		

	}

}
