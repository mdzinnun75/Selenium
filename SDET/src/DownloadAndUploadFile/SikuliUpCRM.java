package DownloadAndUploadFile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliUpCRM {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement element = driver.findElement(By.xpath("//input[@id='imagesrc']"));

		Actions act = new Actions(driver); /// click() method doesn't work, use Actions class
		act.doubleClick(element).build().perform();

		
		// JavascriptExecutor js= (JavascriptExecutor)driver; //click() method doesn't
		// work, use JS
		// js.executeScript("arguments[0].click();", element);
		
		// have to take screenshot of input box and open button
		// have to take screenshot of input box and open button

		String imagesFilepath = "C:\\Users\\MD.ZINNUN UDDIN\\Pictures\\";

		Screen s = new Screen();

		Pattern fileInputTextBox = new Pattern(imagesFilepath + "Annotation 2020-05-22 105739.jpg");  //finding the box where to input file name
		Pattern openButton = new Pattern(imagesFilepath + "Annotation 2020-05-22 105740.jpg");		//finding the Open Button

		Thread.sleep(5000);

		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox, imagesFilepath + "upload.jpg");  //putting the file name 
		s.click(openButton);									  //click on the open button
		// s.type(fileInputTextBox,"upload.jpg");

	}

}
