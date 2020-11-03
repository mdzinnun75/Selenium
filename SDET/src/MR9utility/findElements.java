package MR9utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) {

		//T-15
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://web.facebook.com/?_rdc=1&_rdr");
		
		List <WebElement> links= driver.findElements(By.xpath("//a"));
		System.out.println(links.size());
		//links.get(5).click();
		
		for (int i = 0; i < links.size(); i++) {
			
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));			//it will print the "links" under "href" tag.
		}
		
		
		//print in reverse 
		for (int i = links.size()-1; i >=0; i--) {						//here selenium counts from 1-6, but java loop will index it from 0-5. 
			
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));			//it will print the "links" under "href" tag.
		}
		
	}

}
