package Miscellaneous;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
//
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com.bd/?hl=en");
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(3000);

		List <WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			String option=list.get(i).getText();
			System.out.println(option);
			
			if(option.contains("java jdk")) {
				list.get(i).click();
				break;
			}
		}

	}

}
