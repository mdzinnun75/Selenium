package ActionsClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.expedia.ca/?pwaLob=wizard-hotel-pwa-v2");
		
	}

}
