package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {


		String month="September, 2020";
		String day="20";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://phptravels.net/home");
		
		driver.findElement(By.xpath("//input[@id='checkin']")).click();
		
		Thread.sleep(2000);
		
		while(true) {
			String actTxt= driver.findElement(By.xpath("//div[1]//nav[1]//div[2]")).getText();
			System.out.println(actTxt);
		
			if(actTxt.equals(month)) {
			break;
			}else {
			driver.findElement(By.xpath("//div[1]//nav[1]//div[3]//*[local-name()='svg']")).click();
			}
		}
		
		driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[2]//div[contains(text(),"+day+")]")).click();		
	}

}

