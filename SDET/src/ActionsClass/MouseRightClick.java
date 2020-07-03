package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html/");

		Actions act = new Actions(driver);
		// right_click
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		act.contextClick(button).build().perform();

		// click option
		driver.findElement(By.xpath(
				"//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']//span[contains(text(),'Copy')]"))
				.click();

		// getting_text
		System.out.println(driver.switchTo().alert().getText()); // print alert text
		driver.switchTo().alert().accept();
	}

}
