package DownloadAndUploadFile;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class downloadChrome {
	public static void main(String[] args) throws InterruptedException {
		
		//Creating or predefining download directory, it will create a new directory
		//Creating or predefining download directory, it will create a new directory
		//Creating or predefining download directory, it will create a new directory
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", "C:\\Download Files");
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		//End of the code
		//End of the code
		//End of the code

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(cap);
		//driver.manage().window().maximize();
		
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

