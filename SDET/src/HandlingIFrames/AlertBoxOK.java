package HandlingIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertBoxOK {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//li[@class='active']//a[@class='analystic'][contains(text(),'Alert with OK')]"))
				.click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();

		// switch to alert box
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
