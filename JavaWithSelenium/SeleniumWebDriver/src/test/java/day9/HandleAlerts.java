package day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//1) Normal alert with OK button
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(5000);
		//driver.switchTo().alert(); //it will swith into the alrert window after writing accept it will accept.
		
		//if i want to perform only accept action then below method is good
		//driver.switchTo().alert().accept();
		
		//if i want to perform multiple actions then 
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText()); //I am a JS Alert
		myalert.accept(); //later we will accept the alert
		
		
		//2) Confirmation alert - OK & Cancel
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(5000);
//		driver.switchTo().alert().accept(); //close alert using OK button
//		driver.switchTo().alert().dismiss(); //close alert using Cancel button

		myalert = driver.switchTo().alert();
		System.out.println(myalert.getText()); //I am a JS Confirm
		myalert.dismiss();
		
		//3) Prompt alert - Input box
		WebElement promptAlert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		promptAlert.click();
		
		Thread.sleep(5000);
		Alert myPromptAlert = driver.switchTo().alert();
		myPromptAlert.sendKeys("Welcome"); 
		//myPromptAlert.accept(); //enter and close the alert using OK button
		myPromptAlert.dismiss(); //enter/ null and close the alert using Cacel button
		
		
		

	}

}
