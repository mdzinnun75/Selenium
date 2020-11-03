package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class copyPasteKeys {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		
		WebElement usrname= driver.findElement(By.xpath("//input[@name='email']"));
		usrname.sendKeys("admin");
		usrname.sendKeys(Keys.CONTROL,"a"  +  Keys.CONTROL,"c");
		// usrname.sendKeys(Keys.CONTROL, "c");    can be used the two key in the same line.
		
		WebElement pass= driver.findElement(By.xpath("//input[@name='pass']"));
		pass.sendKeys(Keys.CONTROL, "v");
		
		String attr= pass.getAttribute("value");		//here value is used to get the value we have put in the field
		
		System.out.println("password : "+ attr);
		
	}

}
