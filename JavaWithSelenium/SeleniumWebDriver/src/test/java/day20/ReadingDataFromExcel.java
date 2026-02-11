package day20;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File ---> Workbook ---> Sheets ---> Rows ---> Cells

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//open the file in the reading mode
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
		
		//extracted workbook from the file
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		//in workbook get the sheet and store into the variable name as sheet (extracted specific sheet from the file)
		XSSFSheet sheet = workbook.getSheet("Sheet1");//	XSSFSheet sheet = workbook.getSheetAt(0);
		
		//extract the rows
		int totalRows = sheet.getLastRowNum();
		
		//extract the cells
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of rows : " + totalRows); //5 - rows are counting from 0 
		System.out.println("Number of cells : "+ totalCells); //4 - cells are counting from 1
		
		//when we are running we will get the error as 
		//"2026-02-02T11:50:58.709937300Z main ERROR Log4j API could not find a logging provider."
		//so we will add the dependency i.e., Apache Log4j Core
		
		
		for(int r=0; r<=totalRows; r++) {
			
			XSSFRow currentRow = sheet.getRow(r);
			for(int c=0; c<totalCells; c++) {
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+ "\t");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
	}

}
