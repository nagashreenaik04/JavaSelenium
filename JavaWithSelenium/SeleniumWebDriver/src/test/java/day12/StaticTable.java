package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/?");
		
		//1) find total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //multiple tables
		
		//int rows = driver.findElements(By.tagName("tr")).size(); //single table
		System.out.println("Number of rows : " + rows); //7
		
		//2) find total number of column
		int coloumns = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //multiple tables
		//int coloumns = driver.findElements(By.tagName("th")).size(); //single table
		System.out.println("Number of columns : "+ coloumns); //4 
		
		//3) Read data from specific row and column (ex: 5th row and 1st column)
		String bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println("Book Name : " + bookName); //Master In Selenium
		
		//4) Read data from all the rows and columns
		for(int r=2; r<=rows; r++) {
			for(int c=1; c<=coloumns; c++) {
				String val = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(val +"\t");
			}
			System.out.println();
		}
		
		//5) Print book names whose author is Mukesh (conditional based)
		for(int r=2; r<=rows; r++) {
			String authorName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(authorName.equals("Mukesh")) {
				bookName = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
				System.out.println(bookName + "\t" + authorName);
			}
		}
		
		
		// \t - tab space
		
		
		//6) Find total price of all the books
		int total=0;
		for(int r=2; r<=rows; r++) {
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total = total + Integer.parseInt(price);
		}
		System.out.println("Total price of the all the books is : " + total ); //7100
		
		//Assignments
		//1) https://blazedemo.com/ - go with the flow 
		

	}

}
