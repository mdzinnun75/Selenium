package ImageQrBarCode;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement logoIamge= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/img[1]"));
		
		Screenshot logoImageSS= new AShot().takeScreenshot(driver, logoIamge);
		ImageIO.write(logoImageSS.getImage(), "png",new File("E://Selenium Practice/Screenshot/orangeHrmLogo.png"));
		
		File f= new File("E://Selenium Practice/Screenshot/orangeHrmLogo.png");
		if(f.exists()) {
			System.out.println("image file exists");
		}else {
			System.out.println("image file not exists");
		}
	}

}
