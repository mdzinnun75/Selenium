package ActionsClass;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwtchingWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.xpath("//a[contains(text(),'Open New Tabbed Windows')]")).click();
		driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"))
				.click();

		// System.out.println(driver.getTitle());

		Set<String> s = driver.getWindowHandles();

		for (String i : s) {
			System.out.println(i);
			String t = driver.switchTo().window(i).getTitle();
			System.out.println(t);
			if (t.contains("Frames & windows")) {
				driver.close();
			}
		}
	}

}
