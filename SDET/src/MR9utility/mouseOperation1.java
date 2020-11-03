package MR9utility;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOperation1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement link= driver.findElement(By.xpath("//a[.='actiTIME Inc.']"));
		
		Actions act= new Actions(driver);
		//act.click(link).perform();
		act.contextClick(link).perform();		//right click
		act.sendKeys("t").perform();			//open in new tab
		act.sendKeys("w").perform();			//open in new window
		
	}

}
