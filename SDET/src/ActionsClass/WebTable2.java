package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable2 {

	public static void main(String[] args) {
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://opensource-demo.orangehrmlive.com/");

		// login
				driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				driver.findElement(By.name("Submit")).click();

				Actions act = new Actions(driver);
				WebElement admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
				WebElement usrmmg = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
				WebElement usr = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));


				// three lines in one command
				act.moveToElement(admin).moveToElement(usrmmg).moveToElement(usr).click().build().perform();
				
				int row= driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr")).size();
				System.out.println("No of Row: "+row);
				int statusCount= 0;
				
				for (int i = 1; i < row; i++) {
				String status=  driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/div[1]/div[1]/form[1]/div[4]/table[1]/tbody[1]/tr["+i+"]/td[5]")).getText();

				if(status.contains("Enabled")) {
					statusCount= statusCount+1;
				}
				}
				System.out.println("No of employees Enabled: "+ statusCount);
				
				driver.close();
	}

}
