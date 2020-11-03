package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseOver1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.navigate().refresh();
		
		WebElement men= driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Men')]"));
		WebElement living= driver.findElement(By.xpath("//a[@class='desktop-main'][contains(text(),'Home & Living')]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		act.moveToElement(living).perform();
		

}
	}
