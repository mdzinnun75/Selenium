package Miscellaneous;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateEncoding {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.id("Email")).sendKeys("gorib420@gmail.com");
		driver.findElement(By.id("Password")).sendKeys(decodeString("dGVzdDEyMw=="));
		
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}

	static String decodeString(String password) {
		
		
		byte[] decodeStr= Base64.decodeBase64(password);

		return (new String(decodeStr));
		
	}
}
