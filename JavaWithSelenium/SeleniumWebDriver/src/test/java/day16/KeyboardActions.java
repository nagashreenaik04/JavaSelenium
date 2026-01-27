package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		driver.findElement(By.id("inputText1")).sendKeys("Welcome");
		
		Actions act = new Actions(driver);
		
		//Ctrl + A - select the texts
		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		//Ctrl + C - copy the text
		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();		
		
		//TAB - shift to 2nd box
		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Ctrl + V - paste the text
		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
		
		//Ex: Ctrl + Shift + A
		//act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("A").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
		//Ex: Enter
		//act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		
	}

}
