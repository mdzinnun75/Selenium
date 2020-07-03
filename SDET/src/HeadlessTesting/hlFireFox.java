package HeadlessTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class hlFireFox {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");

		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
		WebDriver driver = new FirefoxDriver(options);

		driver.get("http://demo.nopcommerce.com/");

		System.out.println("title of this page: " + driver.getTitle());

	}

}
