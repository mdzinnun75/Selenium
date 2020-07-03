package ImageQrBarCode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareImage {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		BufferedImage expImage= ImageIO.read(new  File("E://Selenium Practice/Screenshot/orangeHrmLogo.png"));
		
		WebElement logoImage= driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/img[1]"));

		Screenshot logoImageSS= new AShot().takeScreenshot(driver, logoImage);
		BufferedImage actImage= logoImageSS.getImage();
		
		ImageDiffer imgdif= new ImageDiffer();
		ImageDiff diff= imgdif.makeDiff(expImage, actImage);
		
		if(diff.hasDiff()) {
			System.out.println("Images are not same");
		}else {
			System.out.println("Images are same");
		}
		
		driver.quit();
	}

}
