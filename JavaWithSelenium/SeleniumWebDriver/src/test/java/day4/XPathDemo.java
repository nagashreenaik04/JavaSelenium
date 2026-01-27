package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SelectorHub and Devtools
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("T-shirts");
		
		//Xpath with multiple attributes
		driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		
		//Xpath with 'and' operators
		driver.findElement(By.xpath("//input[@name='search' and @placeholder='Search']")).sendKeys("T-shirts");
		
		//Xpath with  'or' operators
		driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("T-shirts");
		
		//Xpath mith inner text - text()
		driver.findElement(By.xpath("//*[text()='MacBook']")).click();
		boolean display_status = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
		System.out.println(display_status);
		String value = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(value);
		
		//Xpath with contains()
		driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')")).sendKeys("T-shirts");
		//here actual string is "Search" but we taken "Sea" only.
		//div[contains(text(),'')]
		//div[contains(.,'')]
		

		//Xpath with starts-with()
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')")).sendKeys("T-shirts");
		//whenever we need to locate dynamic web elements we can use.
		//we will handle the dynamic element using contains() and starts-with() 
		
		//handing dynamic attributes
		//for example1: id=Start id = Stop button changing dynamically
		//*[@id='Start' or @id='Stop']
		//*[contains(@id='St')]
		//*[starts-with(@id='St')]
		//*[contains(text()='St')] //if it is text 
		//for example2: name=xyz001, name=xyz002, name=xyz0003 ... name attribute is keep changing
		//*[contins(@name='xyz00')]
		//*[contins(@name='xyz')]
		//*[contins(@name='00')]
		//*[starts-with(@name='xyz00')]
		//*[starts-with(@name='xyz')]
		//*[starts-with(@name='00')] //it is not possible because with 00, it is not starting.
		//example3: name=001xyz, 002xyz, 003xyz
		//*[contins(@name='00')]
		//*[contins(@name='xyz')]
		//*[starts-with(@name='00')]
		//*[starts-with(@name='xyz')] //it is not possible because it is not staring with xyz.
		//example4: name= 101xyz,201xyz,301xyz,401xyz
		//*[contins(@name='01xyz')]
		//*[contins(@name='xyz')]
		//*[contins(@name='01')]
		//but here start-with is not possible because in above example nothing strts with common value.
		
		//chained xpath
		//div[@id='logo']/a/img
		boolean image_status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(image_status);
		

		
		
	}

}
