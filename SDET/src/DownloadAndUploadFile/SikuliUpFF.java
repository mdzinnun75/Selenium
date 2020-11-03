package DownloadAndUploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliUpFF {

	public static void main(String[] args) throws InterruptedException, FindFailed {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element = driver.findElement(By.xpath("//input[@id='imagesrc']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

		String imagePath = "C:\\Users\\MD.ZINNUN UDDIN\\Pictures\\";
		// String inputFilepath ="C:\\Users\\MD.ZINNUN UDDIN\\Pictures\\New Folder";

		Screen s = new Screen();

		Pattern nameTextBox = new Pattern(imagePath + "Annotation 2020-05-22 105739.jpg");
		Pattern openButton = new Pattern(imagePath + "Annotation 2020-05-22 105740.jpg");

		Thread.sleep(5000);
		
		s.wait(nameTextBox, 20);
		s.type(nameTextBox, imagePath + "Upload.jpg");
		s.click(openButton);
	}

}
