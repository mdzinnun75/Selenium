package HandlingIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertBoxOkCancel {
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		driver.switchTo().alert().accept();

		String exptxtOK = "You pressed Ok";
		String exptxtCancel = "You Pressed Cancel";

		String actTxt = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		if (exptxtOK.equals(actTxt)) {
			System.out.println("Test is PASSED --> ok");
		}

		// click again to cancel
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		driver.switchTo().alert().dismiss();
		String actTxt2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		if (exptxtCancel.equals(actTxt2)) {
			System.out.println("Test is PASSED --> cancel");
		}

	}

}
