package Miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.pavantestingtools.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='close']//a[contains(text(),'X')]")).click();
		WebElement link=driver.findElement(By.xpath("//a[contains(text(),'Training')]"));
		link.click();
		
		Thread.sleep(5000);

		driver.navigate().back();

		try {
			link.click();
			
		} catch (StaleElementReferenceException e) {
			driver.findElement(By.xpath("//button[@id='close']//a[contains(text(),'X')]")).click();

			 link=driver.findElement(By.xpath("//a[contains(text(),'Training')]"));
			 link.click();
		}
		

		
	
	
	
	}

}
