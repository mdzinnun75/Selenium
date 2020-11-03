package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentIndependentXath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.xpath("//td[.='Java']/..//a[.='Download']")).click();
	}

}
