package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {
	
	public static void main(String args[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed()
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println("Display status of logo : " + logo.isDisplayed()); //true
		
		boolean logo_status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println("Logo status is : " + logo_status); //true
		
		//isElebled()
		boolean field_status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
		System.out.println("FirstName field is enabled ? : "+field_status); //ture
		
		//isSelected()
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println("Before Selection.....");
		System.out.println(male_rd.isSelected()); //false
		System.out.println(female_rd.isSelected()); //false
		
		System.out.println("After Slection.....");
		male_rd.click(); //select male radio button
		System.out.println(male_rd.isSelected()); //true
		System.out.println(female_rd.isSelected()); //false
		
		//News letter checkbox status
		boolean status = driver.findElement(By.xpath("//input[contains(@id,'NewsLetterSubscriptions_0__IsActive')]")).isSelected();
		System.out.println("Newsletter checkbox status : " + status ); //true
		driver.quit();
		
	}

}
