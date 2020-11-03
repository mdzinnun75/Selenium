package Miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Test1 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium Resources\\edgedriver_83.478.37_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//input[@class='gNO89b'][@name='btnK']"));
				
	
			
	}

}
