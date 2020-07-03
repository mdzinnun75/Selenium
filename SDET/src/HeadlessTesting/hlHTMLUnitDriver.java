package HeadlessTesting;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class hlHTMLUnitDriver {

	public static void main(String[] args) {

		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://demo.nopcommerce.com/");

		System.out.println("Title of the page: " + driver.getTitle());
		System.out.println("Current URL of the Page: " + driver.getCurrentUrl());
	}

}
