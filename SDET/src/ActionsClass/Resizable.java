package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.automationtesting.in/Resizable.html");

		driver.switchTo().frame(0);
		WebElement resize = driver.findElement(By.id("resizable"));

		Actions act = new Actions(driver);
		act.moveToElement(resize).dragAndDropBy(resize, 250, 170).build().perform();

		Thread.sleep(3000);

	}

}
