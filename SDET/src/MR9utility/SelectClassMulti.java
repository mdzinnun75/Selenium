package MR9utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassMulti {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium Resources\\chromedriver_84\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		
		WebElement dropdown= driver.findElement(By.xpath("   "));			//multiple select list
		
		Select sel= new Select(dropdown);
		
	
		List<WebElement> alloptions= sel.getOptions();
		System.out.println(alloptions.size());
		
		for (int i = 0; i <alloptions.size(); i++) {
			System.out.println(alloptions.get(i).getText());
		}
	
		
		boolean multiselect= sel.isMultiple();
		System.out.println(multiselect);
		
		//if true -->    multiple select
		sel.selectByIndex(0);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		sel.selectByVisibleText("noakhailla");
		
		List<WebElement> selectedOptions= sel.getAllSelectedOptions();		//again refresh the list of selected items
		System.out.println(selectedOptions.size());
		
		for( WebElement x: selectedOptions) {
			System.out.println(x.getText());
		}
		
		
		//deselecting 
		
		sel.deselectByIndex(3);
		sel.deselectByVisibleText("noakhailla");
		sel.deselectAll();
		
	}

}
