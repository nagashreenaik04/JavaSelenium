package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		
//		//single file upload - note.txt
//		driver.findElement(By.id("filesToUpload")).sendKeys("D:\\Shree\\note.txt");
//		
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("note.txt"))
//		{
//			System.out.println("File is successfully uploaded.");
//		}
//		else
//		{
//			System.out.println("File upload failed.");
//		}
		
		
		//Multitple file upload
		String file1 = "D:\\\\Shree\\\\note.txt";
		String file2 = "D:\\\\Shree\\\\Assignment.txt";
		driver.findElement(By.id("filesToUpload")).sendKeys(file1 + "\n" + file2);
		
		int noOfFilesUploaded = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();

		//Validation 1: Number of files
		if(noOfFilesUploaded == 2)
		{
			System.out.println("All files are uploaded.");
		}
		else
		{
			System.out.println("Files are not uploaded or incorrect files uploaded.");
		}
		
		//Validates files name
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("note.txt") &&
				driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("Assignment.txt"))
		{
			System.out.println("Files name matching...");
		}
		else
		{
			System.out.println("Files name are not matching...");
		}

	}

}
