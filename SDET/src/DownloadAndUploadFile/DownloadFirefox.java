package DownloadAndUploadFile;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFirefox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\geckodriver.exe");

		// driver.manage().window().maximize();

		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf"); // list of mime types--->https://www.sitepoint.com/mime-types-complete-list/																				
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		/*		//Creating or predefining download directory, it will create a new directory
				//Creating or predefining download directory, it will create a new directory
				 * 
		profile.setPreference("browser.download.dir", "C:\\Download Files\\");
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("pdfjs.disabled", true); 
		profile.setPreference("browser.download.panel.shown", false); */
		
		//it doesn't work. Robot class works for this only..
		//it doesn't work. Robot class works for this only..

		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);

		WebDriver driver = new FirefoxDriver(option);
		driver.get("http://demo.automationtesting.in/FileDownload.html");

		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("we are here");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();

		Thread.sleep(5000);
		
		//ensuring file existence
		//ensuring file existence
		if(isFileExist("C:\\Download Files\\info.pdf")) {
			System.out.println("file exist");
		}
		else {
			System.out.println("file doesn't exist");
		}
		
	}
	
	static boolean isFileExist(String path) {
		File f=new File(path);
		
		if(f.exists()) {
			return true;
		}
		else {
			return false;
		}
	}

	}

