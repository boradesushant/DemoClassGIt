package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Library {

	public static void main(String[] args) throws IOException {

		
	}
	
	public static String Excell_String (String SheetName,int row ,int cell) throws IOException {
		

		
		String path="C:\\Users\\Sai\\eclipse-workspace\\DemoClassGIt\\TestData\\Data_String.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		return wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		
	}
	
public static Double Excell_numeric (String SheetName,int row ,int cell) throws IOException {
		

		
		String path="C:\\Users\\Sai\\eclipse-workspace\\DemoClassGIt\\TestData\\Data_String.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		XSSFWorkbook wb=new XSSFWorkbook(file);
		
		  return wb.getSheet(SheetName).getRow(row).getCell(cell).getNumericCellValue();
		  
		  
		
		
		
}
}
