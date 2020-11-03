package MR9utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassSingle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		WebElement dropdown= driver.findElement(By.xpath("   "));
		
		Select sel= new Select(dropdown);
		
		       
		boolean multiselect= sel.isMultiple();
		System.out.println(multiselect);			//to ensure the list is multi select eligible or just single select.
		
		
		//if false -->
		sel.selectByVisibleText("chittagong");
		sel.selectByIndex(2);
		sel.selectByValue("divison2");
		
		//single select does not support Deselect  
	}

}
