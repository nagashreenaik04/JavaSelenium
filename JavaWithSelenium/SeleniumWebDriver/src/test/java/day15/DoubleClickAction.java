package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		//switch the frame
		driver.switchTo().frame("iframeResult");
		
		//field 1 remove and enter the data
		WebElement field1 = driver.findElement(By.id("field1"));
		field1.clear();
		field1.sendKeys("Java Selenium");
		WebElement field2 = driver.findElement(By.id("field2"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space(.)='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		
		//validating the field2
		
//		getText() is not working because it is not a inner text. then what to do? how to find the value?
//		String text = field2.getText();
		
		//instead of getText we will use the getAttribute. while we are inspecting the value attributes value then we can't find the proper value.
		//because javascript action will happen only when we perform the actions. so then we will get the attribute value.
		String text = field2.getAttribute("value");
		System.out.println("Captured value : " + text);
		if(text.equals("Java Selenium")) {
			System.out.println("Text copied...");
		}
		else {
			System.out.println("Text not copied properly");
		}
		
		//getText()- returns the inner text of the web element
		//getAttribute(attribute) - returns value of attribute
		
	}

}
