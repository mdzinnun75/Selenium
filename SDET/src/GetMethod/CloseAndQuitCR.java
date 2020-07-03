package GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuitCR {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.get("http://www.popuptest.com/popuptest12.html/");
		driver.get("http://demoaut.com/");

		driver.findElement(By.xpath("//a[contains(text(),'CONTACT')]")).click();

		// driver.close();
		// driver.quit();

	}
}
