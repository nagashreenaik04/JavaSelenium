package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://cdpn.io/EpsilonDeltaCriterion/fullpage/jLoPgE?anon=true&view=");
		
		//switch the frame
		driver.switchTo().frame("result");
		
		Actions act = new Actions(driver);
		
		//drag and drop
		WebElement Stockholm = driver.findElement(By.id("box2")); //source element
		WebElement italy = driver.findElement(By.id("box106"));//target element
		
		act.dragAndDrop(Stockholm, italy).perform();

	}

}
