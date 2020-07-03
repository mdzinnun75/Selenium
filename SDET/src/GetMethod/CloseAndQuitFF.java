package GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuitFF {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// driver.get("http://www.popuptest.com/popuptest12.html/");

		driver.get("http://demoaut.com/");
		driver.findElement(By.xpath("//a[contains(text(),'CONTACT')]")).click();

		// driver.close();
		// driver.quit();

	}
}
