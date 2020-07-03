package TestNGandExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentdemo {
	
		 ExtentTest test;
		 ExtentReports report;
		
		@BeforeTest
		public  void startTest()
		{
			new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/myReport.html");

		//System.getProperty("user.dir")+"/myReport.html");
		test = report.createTest("ExtentDemo");
		}
		
		
		@Test
		public void extentReportsDemo()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		if(driver.getTitle().equals("Google"))
		{
		test.log(Status.PASS, "Navigated to the specified URL");
		}
		else
		{
		test.log(Status.FAIL, "Test Failed");
		}
		}
		
		
		@AfterTest
		public void endTest()
		{
		
		report.flush();
		}
		

}

