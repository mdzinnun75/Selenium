package MR9utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://dhtmlgoodies.com/submitted-scripts/index.html?page=dragDrop");
		//driver.navigate().refresh();
		
		WebElement source= driver.findElement(By.xpath(" "));
		WebElement target= driver.findElement(By.xpath(" "));
		
		Actions act=new Actions(driver);
		act.dragAndDrop(source, target).perform();
		
		
	}

}
