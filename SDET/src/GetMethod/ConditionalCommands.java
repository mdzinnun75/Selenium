package GetMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));

		if (email.isDisplayed() && email.isEnabled()) {
			email.sendKeys("mdzinnun");
		}

		if (password.isDisplayed() && password.isEnabled()) {
			password.sendKeys("123456789");
		}

		// female
		System.out.println(driver.findElement(By.xpath("//input[@id='u_0_6']")).isSelected()); // false
		// male
		System.out.println(driver.findElement(By.xpath("//input[@id='u_0_7']")).isSelected()); // false
		// select_male_radio button
		if (driver.findElement(By.xpath("//input[@id='u_0_7']")).isSelected() == false) {
			driver.findElement(By.xpath("//input[@id='u_0_7']")).click();
		}

	}
}
