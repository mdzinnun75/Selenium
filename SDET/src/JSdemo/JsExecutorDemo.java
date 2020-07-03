package JSdemo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JsExecutorDemo {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.twoplugs.com/");
		// flashing
		// WebElement
		// joinfree=driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]"));
		// JSutil.flash(joinfree, driver);

		// draw border & take the screenshot
		// WebElement
		// drawborder=driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]"));
		// JSutil.drawBorder(drawborder, driver);

		// taking screenshot
		// File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(src, new File("C://Users//MD.ZINNUN
		// UDDIN//Pictures//Screenshots/arc.png"));

		// title of the page
		// String title= JSutil.getTitleByJS(driver);
		// System.out.println(title);

		// clicking on a button
		// WebElement button=
		// driver.findElement(By.xpath("//ul[@class='control-bar']//li[2]//a[1]"));
		// JSutil.click(button, driver);

		// generating alert
		// JSutil.alert(driver, "You clicked on this signup button");

		// refreshing the page
		// JSutil.refresh(driver);

	}

}
