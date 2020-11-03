package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSvalue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		
		WebElement txt= driver.findElement(By.xpath("//div[@class='_8e63 _ihd _3ma mbs _6n _6s _6v']"));
		System.out.println(txt.getCssValue("font-size"));
		System.out.println(txt.getCssValue("font-family"));
		System.out.println(txt.getCssValue("color"));
		
		
	}

}
