package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///E:/Selenium Practice/Web Table.html");
		String text=driver.findElement(By.xpath("html/body/table/tbody/tr[3]/td[3]")).getText();
		
		if(text.contains("15")) {
			System.out.println("test is passed");
		}else {
			System.out.println("test failed");
		}
		
		
		int row= driver.findElements(By.xpath("html/body/table/tbody/tr")).size();
		System.out.println("Row size :" +row);
		
		int column=driver.findElements(By.xpath("html/body/table/tbody/tr/td")).size();
		System.out.println("Column Size :" +column);
		
		for (int i = 2; i <= row; i++) {
			for (int j = 1; j <=3; j++) {
				String txt= driver.findElement(By.xpath("html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(" "+ txt);
			}
			System.out.println();
		}

		
	}

}
