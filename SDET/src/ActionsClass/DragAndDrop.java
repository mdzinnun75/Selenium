package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://dhtmlgoodies.com//scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement source = driver.findElement(By.id("box1"));
		WebElement target = driver.findElement(By.id("box103"));

		Actions act = new Actions(driver);

		// manual drag & drop
		// act.clickAndHold(source).moveToElement(target).release().build().perform();

		// shortcut drag & drop
		act.dragAndDrop(source, target).build().perform();

	}

}
