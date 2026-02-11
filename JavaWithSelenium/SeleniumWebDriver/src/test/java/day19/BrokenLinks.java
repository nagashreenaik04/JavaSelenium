package day19;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/*
 * 1) Link href = "https://xyz.com"
 * 2) https://xyz.com --> server -->status code
 * 3) status code >= 400 broken link
 *    status code < 400 not a broken link
 */

public class BrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links : " + links.size());
		
		int noOfBrokenLinks =0;
		
		
		for(WebElement linkElement : links)
		{
			String hrefAttValue = linkElement.getAttribute("href");
			
			if(hrefAttValue == null || hrefAttValue.isEmpty()) {
				System.out.println("href attribute value is null or empty. So not possible to check or verify.");
				continue;
			}
			
			//hit url to server
			try {
				URL linkURl = new URL(hrefAttValue); //converted href value from String to URL format
				HttpURLConnection  conn = (HttpURLConnection) linkURl.openConnection(); //open connection to the server
				conn.connect(); //connect to server and sent request the server
				
				if(conn.getResponseCode()>=400) {
					System.out.println(hrefAttValue + "=======> Broken Link");
					noOfBrokenLinks++;
				}
				else {
					System.out.println(hrefAttValue + "=======> NOt a broken link");
				}
				
			}
			catch(Exception e){
				System.out.println("Got the ex");
			}
		}
		
		System.out.println("Number of Broken Links: " + noOfBrokenLinks); //42
		
		//Broken Links : is a link which doesn't have resource in the server. 
		//if the status code is greater than or equal to 400 then it is a broken link
		//if the status code is less than 400 then it is not a broken link

	}

}
