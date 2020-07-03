package Cookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		Set<Cookie> cook= driver.manage().getCookies();
		
		System.out.println("1) Cookies size : "+cook.size());
		
		 //find by name
		System.out.println(driver.manage().getCookieNamed("session-id-time"));
		System.out.println();
		//---------------------------------------------------------------------------------------------------
		
		//add cookie
		Cookie obj= new  Cookie("myCookie", "54934");  
		driver.manage().addCookie(obj);
		
		//getting cookies again
		cook=driver.manage().getCookies(); 
		
		System.out.println("2) Cookies Size :"+cook.size());
		
		for(Cookie i: cook) {
			System.out.println(i.getName()+ ":"+i.getValue());
		} System.out.println();
		//----------------------------------------------------------------------------------------------------
	
		driver.manage().deleteCookie(obj);
		driver.manage().deleteCookieNamed("skin");
		cook=driver.manage().getCookies(); //getting cookies again
		System.out.println("3) Cookies Size :"+cook.size());


		
		for(Cookie i: cook) {
			System.out.println(i.getName()+ ":"+i.getValue());
		}
		
		
		
		
	}
	
	

}






















