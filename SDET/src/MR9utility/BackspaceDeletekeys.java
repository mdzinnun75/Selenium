package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackspaceDeletekeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		
		WebElement usrname= driver.findElement(By.xpath("//input[@name='email']"));
		usrname.sendKeys("admin");
		usrname.sendKeys(Keys.CONTROL, "a");
		usrname.sendKeys(Keys.BACK_SPACE);
		
		//or using delete keys
		usrname.sendKeys(Keys.DELETE);
		
		
	}

}
