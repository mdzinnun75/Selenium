package POM;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j {

	public static void main(String[] args) {


		Logger logger= Logger.getLogger("Log4jExample");
		//DOMConfigurator.configure("Log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		logger.info("browser opened");
		
		driver.get("http://demoaut.com/");
		//driver.manage().window().maximize();
		
		logger.info("click on Register tab");
		driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		
		logger.info("enter first name");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Holy");
		
		logger.info("enter last name");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Shit");
		
		logger.info("closing browser");
		driver.close();
		
		
		
	}

}
