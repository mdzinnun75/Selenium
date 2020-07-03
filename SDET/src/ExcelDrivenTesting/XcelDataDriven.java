package ExcelDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class XcelDataDriven {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Selenium Resources\\edgedriver_83.478.37_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://demoaut.com/mercurywelcome.php?osCsid=9755c523aa460a7dce8f4fbe6ce1b67d");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();

		FileInputStream file = new FileInputStream("C://Selenium Resources//Book2.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");

		int rowcount = sheet.getLastRowNum();
		System.out.println("no of records in the excel sheet: " + rowcount);

		for (int row = 1; row <= rowcount; row++) {
			XSSFRow current_row = sheet.getRow(row);

			
			//XSSFCell first_name =current_row.getCell(0);
			//String fName=first_name.getStringCellValue(); 			(same but manual way to get and store the value)
			//															(same but manual way to get and store the value)
			
			String first_name = current_row.getCell(0).getStringCellValue();
			String last_name = current_row.getCell(1).getStringCellValue();
			//String phone = current_row.getCell(2).getStringCellValue();
			int phone = (int) current_row.getCell(2).getNumericCellValue();		//to get the value as integer value (type casting), string also can be used  
			String email = current_row.getCell(3).getStringCellValue();
			String address = current_row.getCell(4).getStringCellValue();
			String city = current_row.getCell(5).getStringCellValue();
			String state = current_row.getCell(6).getStringCellValue();
			String postal_code = current_row.getCell(7).getStringCellValue();
			String country = current_row.getCell(8).getStringCellValue();
			String username = current_row.getCell(9).getStringCellValue();
			String password = current_row.getCell(10).getStringCellValue();

			// REGISTRATION

			driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(first_name);
			driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(last_name);
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(phone));		//converting string value to integer value ----> String.valueOf();
			driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(email);
			driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
			driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(address);
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
			driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
			driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postal_code);

			// drop down
			Select dropcountry = new Select(driver.findElement(By.xpath("//select[@name='country']")));
			dropcountry.deselectByVisibleText(country);

			driver.findElement(By.xpath("//select[@name='country']")).sendKeys(country);
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(password);

			// submitting form
			driver.findElement(By.xpath("//input[@name='register']")).click();

			if (driver.getPageSource().contains("Thank you for registering")) {
				System.out.println("Registration coompleted for " + row + " record");
			} else {

				System.out.println("Registration failed for " + row + " record");
			}

		}
	}

}
