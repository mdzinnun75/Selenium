package ExcelDrivenTesting;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {

	public static void main(String[] args) throws IOException {


		FileOutputStream file= new FileOutputStream("E://Selenium Practice//Test3.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook();
		XSSFSheet sheet= workbook.createSheet("Data");
		
		
		for(int i=0; i<=5; i++) {
			XSSFRow row =sheet.createRow(i);
			
			for (int j = 0; j <3; j++) {
				row.createCell(j).setCellValue("xyz");
			}
		}
		
		workbook.write(file);
		file.close();
		
		System.out.println("data written in the excel file");
	}

}
