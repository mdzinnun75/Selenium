package DownloadAndUploadFile;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadFFstringSelection {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/FileDownload.html");  					//need to be changed**

		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("we are here");	//need to be changed**
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();					//need to be changed**
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();			//need to be changed**
		
		StringSelection file= new StringSelection("E:\\Selenium Practice\\CV.docx");
		//StringSelection file1= new StringSelection("E:\\Selenium Practice\\CV1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);    		//one more file can be saved replacing "null" value
		
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
