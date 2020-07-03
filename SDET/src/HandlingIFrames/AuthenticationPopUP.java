package HandlingIFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticationPopUP {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		// driver.get("https://the-internet.herokuapp.com/basic_auth");
		// http:// username:password@test.com
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		String text = driver.findElement(By.cssSelector(
				"body:nth-child(2) div.row:nth-child(2) div.large-12.columns:nth-child(2) div.example > p:nth-child(2)"))
				.getText();

		System.out.println(text);
	}

}
