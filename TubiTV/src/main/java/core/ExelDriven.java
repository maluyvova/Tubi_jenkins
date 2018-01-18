package core;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelDriven {
	public static void main(String [] args) throws IOException {
		
		
		FileInputStream file = new FileInputStream("/Users/maluy/eclipse-workspace/TubiTV/Workbook2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("varial");
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell =row.getCell(1);
		String value=cell.getStringCellValue();
		System.out.println(value);
	}

}
