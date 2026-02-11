package day20;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("welcome");
		row1.createCell(1).setCellValue("123");
		row1.createCell(2).setCellValue(true);
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Hi");
		row2.createCell(1).setCellValue("456");
		row2.createCell(2).setCellValue(false);
		
		workbook.write(file);
		
		workbook.close();
		file.close();
		
		System.out.println("Excel file is created....");

	}

}
