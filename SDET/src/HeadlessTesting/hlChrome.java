package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class hlChrome {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		// options.addArguments("--headless");
		options.setHeadless(true);
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://demo.nopcommerce.com/");

		System.out.println("title of this page: " + driver.getTitle());

	}

}
