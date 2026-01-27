package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.opencart.com/TlbeVW/");
		
		driver.findElement(By.xpath("//button[normalize-space(.)='Login']")).click();
		
		//close window if it is available
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		driver.findElement(By.partialLinkText("Customers")).click(); //Customers main menu
		driver.findElement(By.linkText("Customers")).click(); //Customers 
		
		String text = driver.findElement(By.xpath("//div[contains(text(),'Showing')]")).getText();
		int totalPages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		//repeating pages
		for(int p=1; p<=5; p++) {
			if(p>1) {
				WebElement activePage = driver.findElement(By.xpath("//ul[@class=\"pagination\"]//*[text()="+p+"]"));
				activePage.click();
			}
			
			//reading data from the particular page
			int numOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
			for(int r=1; r<=numOfRows; r++)
			{
				String customerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				String email = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
				System.out.println(customerName + "\t" + email);
			}
		}
		
		//Assignments
		//1) TestAutomationPractice -> Pagination Table
		//2) OrangeHRM table -> Admin Page tables
		
		
		

	}

}
