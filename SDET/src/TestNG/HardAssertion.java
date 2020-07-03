package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssertion {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoaut.com/");
		
		WebElement userTxt= driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement passTxt=driver.findElement(By.xpath("//input[@name='password']"));
		
		//Assert.assertTrue(userTxt.isDisplayed());
		//userTxt.sendKeys("mercury");
		
		Assert.assertFalse(userTxt.isDisplayed());
		userTxt.sendKeys("mercury");
		
		Assert.assertTrue(passTxt.isDisplayed());
		userTxt.sendKeys("mercury");
		
		
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		String expTitle= "Sign-on: Mercury Tours";
		
		
		Assert.assertEquals(driver.getTitle(), expTitle);
		
		driver.close();
		
			
		}
	}


















