package TestNG;

import org.testng.Assert;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Test;


public class Listeners extends TestListenerAdapter {
	
		@Test(enabled=false) //disabled ++ can also be done with xml file
		public void loginbytwitter() {
			System.out.println("login by twitter");
			Assert.assertEquals("Zinnun", "uddin");
		}
		
		
		@Test
		public void loginbyEmail() {
			System.out.println("login by email");
			Assert.assertEquals("Zinnun", "Zinnun"); //true
		}
		
		@Test
		public void loginbyfacebook() {
			System.out.println("login by facebook");
			Assert.assertEquals("Zinnun", "uddin"); //false
		}		
		
	}


