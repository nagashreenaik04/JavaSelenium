package day21;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FDCalculator {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/hsbc/fixed-deposit-calculator-ZZZ-BHS001.html?classic=true");
		
		String filepath = System.getProperty("user.dir") + "\\testdata\\FixedDepositeCalculator.xlsx";
		String sheet = "Sheet1";
		int rows =ExcelUtils.getRowCount(filepath, sheet );
		
		for(int i=1; i<=rows; i++) {
			//read data from excel
			
			String princ=ExcelUtils.getCellData(filepath, sheet, i, 0);
			String roi=ExcelUtils.getCellData(filepath, sheet, i, 1);
			String per1=ExcelUtils.getCellData(filepath, sheet, i, 2);
			String per2=ExcelUtils.getCellData(filepath, sheet, i, 3);
			String frqncy=ExcelUtils.getCellData(filepath, sheet, i, 4);
			String exp_mval=ExcelUtils.getCellData(filepath, sheet, i, 5);
			
			
			//pass above data into application
			driver.findElement(By.id("principal")).sendKeys("princ");
			driver.findElement(By.id("interest")).sendKeys("roi");
			driver.findElement(By.id("tenure")).sendKeys("per1");
			
			WebElement per = driver.findElement(By.id("tenurePeriod"));
			Select perdrp = new Select(per);
			perdrp.selectByVisibleText(per2);
			
			WebElement fre = driver.findElement(By.id("frequency"));
			Select freqdrp = new Select(fre);
			freqdrp.selectByVisibleText(frqncy);
			
			driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click(); //clicked on calculate 
			
			//validation
			String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval]//strong")).getText();
			
			if(Double.parseDouble(exp_mval)==Double.parseDouble(act_mvalue)) {
				System.out.println("Test Passed...");
				//Test passed - last cell need to updated
				ExcelUtils.setCellData(filepath, sheet, i, 7, "Passed");
				ExcelUtils.fillGreenColor(filepath, sheet, i, 7);
			}
			else {
				System.out.println("Test Failed");
				ExcelUtils.setCellData(filepath, sheet, i, 7, "Failed");
				ExcelUtils.fillRedColr(filepath, sheet, i, 7);
			}
			
			driver.findElement(By.xpath("//img[@class='PL5']")).click(); //clicked on clear button
			
		}//ending of for loop
		driver.close();
		
	}

}
