package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseOp3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//driver.navigate().refresh();
		
		WebElement link= driver.findElement(By.xpath("//a[contains(text(),'actiTIME Inc.')]"));
		
		Actions act=new Actions(driver);
		act.clickAndHold(link).perform();
		Thread.sleep(5000);
		act.release(link).perform();
	}

}
