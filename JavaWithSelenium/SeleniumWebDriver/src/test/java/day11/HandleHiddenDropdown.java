package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Login Steps
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(normalize-space(.), 'Login')]")).click();
		
		//Clicking on PIM
		driver.findElement(By.xpath("//span[contains(normalize-space(.), 'PIM')]")).click();
		
		//clicked on dropdown
		driver.findElement(By.xpath("(//label[text()='Job Title']//following::div)[1]")).click();
		
		//select single option
//		driver.findElement(By.xpath("//span[text()='Automaton Tester']")).click();
		
		//count number of options
		List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("Number of options : " + options.size());
		
		//printing options
		for(WebElement opt :options)
		{
			System.out.println(opt.getText());
		}
		
		
		//Assignments
		//

	}

}
