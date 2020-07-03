package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class POM_Alternative {
		
		WebDriver driver;
		
		@FindBy(how=How.LINK_TEXT, using="Register")
		WebElement Reglink;
		
		@FindBy(how=How.NAME, using="FirstName")
		WebElement firstName;
		
		//@FindBy(name="FirstName")
		//WebElement firstName;
		
		@FindBy(name="lastName")
		WebElement lastName;

	
		/*
		RegPage2(WebDriver d){		//action class needs to be created
			driver=d;
			PageFactory.initElements(d, this);	//additional method
		} */
		
		public void clickReglink() {
			Reglink.click();
		}
		
		public void firstName() {
			firstName.sendKeys("Zinnun");
		}
	

}


