package AutoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadCRM {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element = driver.findElement(By.xpath("//input[@id='imagesrc']"));
		
		Actions act = new Actions(driver); /// click() method doesn't work, use Actions class
		act.doubleClick(element).build().perform();
		
		Runtime.getRuntime().exec("C:\\Selenium Resources\\fileupload.exe");  //execute the auto it exe file
	}

}
