package MR9utility;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionClassDragDrop2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.aa.com/homePage.do?locale=en_US");
		driver.manage().window().maximize();
		
		WebElement from= driver.findElement(By.xpath("(//input[@name='originAirport'])[1]"));
		WebElement to= driver.findElement(By.xpath("//div[@class='position-relative margin-bottom']//input[@name='destinationAirport']"));
		
		from.clear();
		from.sendKeys("san");
		Thread.sleep(7000);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
		from.sendKeys(Keys.TAB);
		from.sendKeys(Keys.TAB);
		
		to.sendKeys("port");
		Thread.sleep(7000);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
		
		//System.out.println("program executed");
		
		//driver.findElement(By.xpath("//div[@id='aa-booking-module']//div[1]//div[1]//button[1]")).click();
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='29'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[2]")).click();
		driver.findElement(By.xpath("//a[.='17']")).click();	//as in the first calendar day 17 is hidden. today 27/08/2020


		driver.close();
		driver.quit();
	}

	
}
