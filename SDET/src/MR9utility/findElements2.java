package MR9utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements2 {

	public static void main(String[] args) {
				//T-15
				System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
				WebDriver driver= new ChromeDriver();
				driver.get("https://google.com");
				
				//handling Auto Suggestion, xpath will use "contains"  and then index
	}

}
