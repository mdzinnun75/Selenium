package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		// login
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		
		//hovering the mouse
		Actions act = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		WebElement usrmmg = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement usr = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));

		// hover mouse on elements
		/*
		 * act.moveToElement(admin).build().perform();
		 * act.moveToElement(usrmmg).build().perform();
		 * act.moveToElement(usr).click().build().perform();
		 */

		// three lines in one command
		act.moveToElement(admin).moveToElement(usrmmg).moveToElement(usr).click().build().perform();
	}

}
