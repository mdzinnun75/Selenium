package BasicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");

		// FirefoxDriver driver= new FirefoxDriver();
		WebDriver driver = new FirefoxDriver();

		driver.get("http://demoaut.com/");
		

		// WebElement userName = driver.findElement(By.name("userName"));
		// userName.sendKeys("mercury");
		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");

		driver.findElement(By.name("login")).click();

		String exptitle = "Welcome: Mercury Tours";
		String acttitle = driver.getTitle();

		if (exptitle.equals(acttitle)) {
			System.out.println("Test is PASSED!!");
		} else {
			System.out.println("Test is FAILED!");
		}

		driver.close();

	}

}
