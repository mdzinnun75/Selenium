package BasicTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");

		// FirefoxDriver driver= new FirefoxDriver();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demoaut.com/");

		// WebElement userName = driver.findElement(By.name("userName"));
		// userName.sendKeys("mercury");
		driver.findElement(By.name("userName")).sendKeys("mercury");

		driver.findElement(By.name("password")).sendKeys("mercury");

		driver.findElement(By.name("login")).click();

		String exptitle = "Find a Flight: Mercury Tours:";
		String acttitle = driver.getTitle();

		if (exptitle.equals(acttitle)) {
			System.out.println("Test is PASSED!!");
		} else {
			System.out.println("Test is FAILED!");
		}

		driver.close();

	}
}
