package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		Actions act = new Actions(driver);
		
		//Min Slider
		WebElement minSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[1]"));
		System.out.println("Location of the minimum slider Before moving(default locations)  : " + minSlider.getLocation());//(59, 250)
		
		act.dragAndDropBy(minSlider, 100, 250).perform();
		System.out.println("Location of the minimum slider after moving : " + minSlider.getLocation());//(161, 250)
		
		//Max Slider
		WebElement maxSlider = driver.findElement(By.xpath("//div[@class='price-range-block']//span[2]"));
		System.out.println("Location of the maximum slider before moving (default location) : " + maxSlider.getLocation()); //(545, 250)
		
		act.dragAndDropBy(maxSlider, -100, 250).perform();
		System.out.println("Location of maximum slider after moving : " + maxSlider.getLocation()); //(443, 250)

		
	}

}
