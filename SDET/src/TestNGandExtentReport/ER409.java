package TestNGandExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ER409 {
	public WebDriver driver;
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	@BeforeTest
	public void setExtent()
	{
		htmlReporter= new ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/myReport.html");
		htmlReporter.config().setDocumentTitle("Automaton Report");// title of the report
		htmlReporter.config().setReportName("Fuctional Report"); //name of the report
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent =new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("HostName", "Local Host");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Tester Name", "Zinnun");
		extent.setSystemInfo("Browser", "Chrome");
	}
	
	@AfterTest
	public void endReport() {
		extent.flush();
	}
	
	@BeforeTest
	public void setup() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}

	@Test
	public void nopCommerceTitleTest() {
		
		test= extent.createTest("nopCommerceTitleTest");
		String title= driver.getTitle();
		System.out.println("nopCommerce demo store");
		Assert.assertEquals(title,"nopCommerce demo store" );
	
	}
	
	@Test
	public void noCommerceLogoTest() {
		test= extent.createTest("noCommerceLogoTest");
		Boolean status = driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
		Assert.assertTrue(status);
		
	}
	
	@Test
	public void noCommerceLogInTest() {
		test= extent.createTest("noCommerceLogInTest");
		Assert.assertTrue(true);
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		 if (result.getStatus() == ITestResult.FAILURE)
	            test.log(Status.FAIL, "TEST CASE FALED IS " +result.getName()); //add name in ER 
		 		test.log(Status.FAIL, "TEST CASE FALED IS " +result.getThrowable()); //add error in 
	
	
		 if (result.getStatus() == ITestResult.SKIP) {
	            test.log(Status.SKIP, "TEST CASE SKIPPED IS " +result.getName()); 
		 }
	
	else if(result.getStatus() == ITestResult.SUCCESS){
				test.log(Status.PASS, "TEST CASE PASSED IS " +result.getName());		
	}
}
}






















