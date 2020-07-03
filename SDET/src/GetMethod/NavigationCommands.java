package GetMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demoaut.com/");
		System.out.println("Title of the page: " + driver.getTitle());

		driver.navigate().to("http://google.com/");
		System.out.println("URL of the page: " + driver.getCurrentUrl());

		driver.navigate().back();

		driver.navigate().forward();

		driver.navigate().refresh();

		driver.close();

	}

}
