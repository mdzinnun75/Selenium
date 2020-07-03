package JSdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollingDownUsingJS {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// scroll by using pixel
		// js.executeScript("window.scrollBy(0, 1000)");

		// scroll by find element
		// WebElement flag=
		// driver.findElement(By.xpath("//table[1]//tbody[1]//tr[16]//td[1]//img[1]"));
		// js.executeScript("arguments[0].scrollIntoView();", flag);

		// scroll page till bottom
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
