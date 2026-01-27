package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo {
	
	//select future date (month, year and date)
	static void selectFutureDate(WebDriver driver, String month, String year, String date)
	{
		//select month and year
		while(true)
		{
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //actual month
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText(); //actual year
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Next
//			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //Previous
			//In real time application only we can select upcoming dates either previous dates. (for ex: date of departure, date of birth etc)
			//we shouldn't take at a time both. so in the above we can enable the statement based upon our conditions.
			
		}
		
		//select the date
		List<WebElement> allDates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
	
		for(WebElement dt : allDates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
		
		
	}
	
	
//	static void selectDate(WebDriver driver, String date)
//	{
//		//select the date
//		List<WebElement> allDates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
//		
//		for(WebElement dt : allDates)
//		{
//			if(dt.getText().equals(date))
//			{
//				dt.click();
//				break;
//			}
//		}
//		
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//switch to frame
		driver.switchTo().frame(0); //only one frame so index used
		
		//Method 1: using sendkeys()
//		driver.findElement(By.id("datepicker")).sendKeys("01/09/2026"); //mm/dd/yyyy
		
		//Method 2: using date picker
		//expected data
		String year = "2026";
		String month = "April";
		String date = "30";
		driver.findElement(By.id("datepicker")).click(); //open date picker element
		
		
//		selectMonthAndYear(driver,month,year);
//		selectDate(driver, date);
		
		selectFutureDate(driver,month,year,date);
//		selectPastDate(driver,month,year,date); //sometimes while pulling the bank statement we need to pull the previous and future dates then we can use like this
		
		

	}

}
