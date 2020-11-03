package BasicTest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("http://testautomationpractice.blogspot.com/");
		WebElement drp = driver.findElement(By.xpath("//select[@id='products']"));
		Select t = new Select(drp);
		// t.selectByIndex(2);
		t.selectByVisibleText("Iphone");

		System.out.println(t.getOptions().size());

		driver.findElement(By.xpath("//label[contains(text(),'Cricket')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Movies')]")).click();

	}

}
