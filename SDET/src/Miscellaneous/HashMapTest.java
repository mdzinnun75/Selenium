package Miscellaneous;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapTest{
	
	static HashMap<String, String> loginData(){	
		HashMap <String, String> hm= new HashMap <String, String>();
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury@mercury1");
		hm.put("z", "mercury@mercury2");
		
		return hm;
	}

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demoaut.com/");
		//driver.manage().window().maximize();
		
		//login as x
		String signIn= loginData().get("x");
		String arr[] =signIn.split("@");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(arr[0]);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(arr[1]);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		if(driver.getTitle().equals("Sign-on: Mercury Tours")) {
			System.out.println("test PASSED");
		}else {
			System.out.println("test failed");
		}

	}
}

