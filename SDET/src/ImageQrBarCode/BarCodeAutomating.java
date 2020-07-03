package ImageQrBarCode;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class BarCodeAutomating {

	public static void main(String[] args) throws IOException, NotFoundException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/search?q=bar+code");
		
		String barCodeURl= driver.findElement(By.xpath("//div[@id='HTML12']//div[@class='widget-content']//img[1]")).getAttribute("src");
		System.out.println(barCodeURl);
		
		URL url= new URL(barCodeURl);
		
		BufferedImage bufferedImage= ImageIO.read(url);
		
		LuminanceSource luminanceSource= new BufferedImageLuminanceSource(bufferedImage);
		
		BinaryBitmap bitmap= new BinaryBitmap(new HybridBinarizer(luminanceSource));
		
		Result result= new MultiFormatReader().decode(bitmap);
		
		System.out.println(result.getText());
		
		
		
		
		
		
		
	}

}
