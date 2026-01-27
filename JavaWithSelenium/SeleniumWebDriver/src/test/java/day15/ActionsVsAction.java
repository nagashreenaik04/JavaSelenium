package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act = new Actions(driver);
		
		Action myaction = act.contextClick(button).build(); //Action variable will hold the build() [building/creating an action and storing into a variable
	
		myaction.perform(); //we are performing/completing action
		
		//Actions -- class , will be used to perform mouse actions
		//Action -- interface, will be used to store created actions
		
		
		//Assignments
		//1) testautomationPractice - > doubleClick and Drag and drop
		//2) https://demo.guru99.com/test/drag_drop.html -DRAG AND DROP
		
		

	}

}
