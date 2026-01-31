package day18;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionsAtRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This app contains more ads so we install the particular plugin Ad blocker.
		// this plugin will block all our ads in the browser.
		//so when we open the browser in manually we can't see the ads
		//But when we are opening through automation then we can see the ads 
		//so when we lunch/run the website then we need to block the ads
		//to block the ad directly through the automation is not posible
		//so we need to do the 2 things i.e.,
		//1. Extension should be enable 
		//2. Once it is enable it will take care of block the ads 
				
		//Enable extension in browser - 4 steps
		//1) Add CRX Extractor/Downloader to chrome Browser (manually)
		//2) Add SelecotrHub plugin to chrome browser (manually)
		//3) Capture crx file for selectorhub extension - [we have to download this]
		//4) Pass crx file path in automation script in Chrome Options
		
		ChromeOptions options = new ChromeOptions();
		File file = new File("C:\\Downloads\\SelectorHub.crx"); //path of the crx file ....
		options.addExtensions(file);
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://text-compare.com/");
		
		//how to block the ads on the page
		//uBlock-Origiin
		//AdBlocker
	

	}

}
