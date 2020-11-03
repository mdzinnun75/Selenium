package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByContains {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		/*
		String text=driver.findElement(By.xpath("//button[contains(text(),'Sign')][@id='u_0_17']")).getText();
		System.out.println("Link Text :" +text);
		
		String title=driver.getTitle();
		System.out.println("Title :" +title); */
		
		//backward transversing
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[2]/input[1]/../../td[1]/input")).sendKeys("hellsink");
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("hellsink");
		
	}

}
