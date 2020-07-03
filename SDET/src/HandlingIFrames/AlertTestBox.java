package HandlingIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertTestBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();

		driver.switchTo().alert().sendKeys("Zinnun");
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

		Thread.sleep(4000);

		String exptxt = "Hello Zinnuun How are you today";
		String acttxt = driver.findElement(By.xpath("//p[@id='demo1']")).getText();

		if (exptxt.equals(acttxt)) {
			System.out.println("Test is PASSED");
		}

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		driver.switchTo().alert().dismiss();

	}

}
