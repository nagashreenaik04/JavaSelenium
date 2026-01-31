package day18;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenshotsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://demo.nopcommerce.com/");
		
		//1) Full page screenshot
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
////		File targetFile = new File("D:\\EclipseWorkspace\\JavaWithSelenium\\SeleniumWebDriver\\screenshotFolder\\fullpage.png");
//		File targetFile = new File(System.getProperty("user.dir")+"\\\\screenshotFolder\\\\fullpage.png");
//		sourceFile.renameTo(targetFile); //copy sourceFile to targerFile
		
		//2)capture the screenshot of the specific section
//		WebElement featureProducts = driver.findElement(By.xpath("//section[@class='product-grid home-page-product-grid']"));
//		File sourceFile = featureProducts.getScreenshotAs(OutputType.FILE);
//		File targetFile = new File(System.getProperty("user.dir")+"\\screenshotFolder\\featureProducts.png");
//		sourceFile.renameTo(targetFile); 
		
		//3)capture the screenshot of webelement
		WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshotFolder\\logo.png");
		sourceFile.renameTo(targetFile);
		
		driver.quit();
		
		
	}

}
