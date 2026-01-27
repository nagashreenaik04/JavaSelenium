package day14;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerDemo2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.id("txtDate")).click(); // contains the format as - 06/08/2023 [dd/mm/yyyy]
		
		//input data
		String requireYear = "2023";
		String requireMonth = "Aug";
		String requireDate = "6";
		
		//select year
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByVisibleText(requireYear);
		
		//select month
		//1) If month have a dropdown
//		WebElement monthDropDown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
//		Select selectMonth = new Select(monthDropDown);
//		selectMonth.selectByVisibleText(requireMonth);
		
		//2) If month doesn't have a dropdown (just have previous and next icon)
		while(true)
		{
			String displayMonth = driver.findElement(By.xpath("//select[@aria-label='Select month']//option[@selected='selected']")).getText();
			//convert requireMonth and displayMonth into Month Object
			Month expectedMonth = convertMonths(requireMonth);	
			Month currentMonth = convertMonths(displayMonth);
			//compare months
			int result = expectedMonth.compareTo(currentMonth);
			
			// 0 months are equal
			//>0 future month
			//<0 past
			
			if(result<0)
			{
				//past month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			}
			else if(result>0)
			{
				//future month
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}
			else
			{
				break;
			}
		}
		
		
		//select date
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
		for(WebElement dt : allDates)
		{
			if(dt.getText().equals(requireDate))
			{
				dt.click();
				break;
			}
		}
		
	}
	
	//2) If month doesn't have a dropdown (just have previous and next icon)
	//user defined function for converting month from String --> Month
	static Month convertMonths(String month) {
		HashMap<String, Month> monthMap = new HashMap<String, Month>();
		monthMap.put("Jan", Month.JANUARY);
		monthMap.put("Feb", Month.FEBRUARY);
		monthMap.put("Mar", Month.MARCH);
		monthMap.put("Apr", Month.APRIL);
		monthMap.put("May", Month.MAY);
		monthMap.put("Jun", Month.JUNE);
		monthMap.put("Jul", Month.JULY);
		monthMap.put("Aug", Month.AUGUST);
		monthMap.put("Sep", Month.SEPTEMBER);
		monthMap.put("Oct", Month.OCTOBER);
		monthMap.put("Nov", Month.NOVEMBER);
		monthMap.put("Dec", Month.DECEMBER);
		
		Month vmonth = monthMap.get(month);
		
		if(vmonth == null)
		{
			System.out.println("Invalid Month...");
		}
		
		return vmonth;
	}

	
	//Assigment
	//dummy ticket com
	//dummy ticket booking
}
