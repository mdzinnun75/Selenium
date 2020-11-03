package ExcelDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelData {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("C://Selenium Resources//Book1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum();
		System.out.println("row number: "+ rowcount);
		int colcount = sheet.getRow(0).getLastCellNum();
		System.out.println("column number: "+ colcount);

		for (int i = 0; i < rowcount; i++) {
			XSSFRow currentrow = sheet.getRow(i);

			for (int j = 0; j < colcount; j++) {
				String value = currentrow.getCell(j).toString();
				System.out.print("  " + value);
			}
			System.out.println();
		}

	}

}
