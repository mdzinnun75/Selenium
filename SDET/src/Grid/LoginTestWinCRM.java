package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LoginTestWinCRM {
	WebDriver driver;
	
	@Test(priority=1)
	void setup() throws MalformedURLException {
		String nodeURL= "http://192.168.43.57:4444/wd/hub";
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
				
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL(nodeURL),cap);
	}
	
	@Test(priority=2)
	void login() {
		driver.get("http://practice.automationtesting.in/my-account/");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("pavanoltraining");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@selenium123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	
	@Test(priority=3)
	void validate() {
		String txt=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/p[1]")).getText();
		
		if(txt.contains("pavanoltraining")) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
	}
	
	@Test(priority=4)
	void close() {
		driver.close();
	}

}
