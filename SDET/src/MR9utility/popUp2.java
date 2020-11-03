package MR9utility;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		
		Set<String> winHandle=driver.getWindowHandles();
		System.out.println(winHandle.size());
		
		ArrayList<String> al= new ArrayList<>(winHandle);
		//driver.switchTo().window(al.get(3));
		//System.out.println(driver.getTitle());
		//driver.close();
		
		for (int i = 0; i <= winHandle.size()-1; i++) {							// i < winHandle.size(); will work also.
			driver.switchTo().window(al.get(i));
			System.out.println(driver.getTitle());
			}
		
		driver.close();
		driver.quit();
	}
	

}
