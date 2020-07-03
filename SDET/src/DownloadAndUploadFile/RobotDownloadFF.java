package DownloadAndUploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RobotDownloadFF {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");

		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("we are here");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();

		
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);	//press the down arrow key
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_TAB);  //press the down TAB key
		Thread.sleep(3000);
		rob.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		
		
		rob.keyPress(KeyEvent.VK_ENTER);
	}

}
