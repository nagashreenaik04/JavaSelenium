package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Self
		//Parent
		//Child
		//Ancestor
		//Decendents
		//following
		//precending
		//following sibling
		//precending sibling
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		//self
		String text = driver.findElement(By.xpath("//a[contains(text(),'Balaji Amines')]/self::a")).getText();
		System.out.println(text);  //Balaji Amines
		
		//Parent
		String textP = driver.findElement(By.xpath("//a[contains(text(),'Balaji Amines')]/parent::td")).getText();
		System.out.println(textP);  //Balaji Amines
		
		//Child
		List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Balaji Amines')]/ancestor::tr/child::td"));
		System.out.println("Number of child elements : " + childs.size()); //6
		
		//Ancestor
		text =driver.findElement(By.xpath("//a[contains(text(),'Balaji Amines')]/ancestor::tr")).getText();
		System.out.println(text);
		
		//Descendant
		List<WebElement> decendants = driver.findElements(By.xpath("//a[contains(text(),'Balaji Amines')]/ancestor::tr/descendant::*"));
		System.out.println("Number of descendant nodes : " + decendants.size());
		
		//following
		List<WebElement> following_nodes = driver.findElements(By.xpath("//a[contains(text(),'Balaji Amines')]/ancestor::tr/following::tr"));
		System.out.println("Number of following nodes : " + following_nodes.size());
		
		//following-sibling 
		List<WebElement> following_sibling = driver.findElements(By.xpath("//a[contains(text(),'Balaji Amines')]/ancestor::tr/following-sibling::tr"));
		System.out.println("Number of following siblings : " + following_sibling.size());
		
		//Preceding 
		List<WebElement> preceding_nodes = driver.findElements(By.xpath("//a[contains(text(),'Balaji Amines')]/ancestor::tr/preceding::tr"));
		System.out.println("Number of preceding nodes : " + preceding_nodes.size());
		
		//preceding-sibling
		List<WebElement> preceding_sibling = driver.findElements(By.xpath("//a[contains(text(),'Balaji Amines')]/ancestor::tr/preceding-sibling::*"));
		System.out.println("Number of preceding siblings : " + preceding_sibling.size());
		
		driver.close();
		

	}

}
