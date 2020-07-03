package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BrokenLinks1 {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.newtours.demoaut.com/mercurywelcome.php");
		Thread.sleep(3000);

		// finding links started with </a>
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// no of links
		System.out.println(links.size());

		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url);

			// create an object using URL object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			Thread.sleep(2000);
			// establish connection
			httpConn.connect();

			int rescode = httpConn.getResponseCode(); // if it returns above 400= broken link
			if (rescode >= 400) {
				System.out.println(url + " - " + " is broken link");
			} else {
				System.out.println(url + " - " + " is valid link");
			}
		}
	}

}
