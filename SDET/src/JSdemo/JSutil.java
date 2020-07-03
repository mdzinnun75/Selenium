package JSdemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSutil {

	public static void flash(WebElement element, WebDriver driver) {
		// JavascriptExecutor js= ((JavascriptExecutor) driver);

		String bgcolor = element.getCssValue("backgroundColor");

		for (int i = 0; i < 500; i++) {
			changeColor("#000000", element, driver); // 1
			changeColor(bgcolor, element, driver); // 2
		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor= '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {

		}
	}

	// draw a border around an element
	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border= '3px solid red'", element);
	}

	// getting the title
	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	// clicking an element
	public static void click(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);
	}

	public static void alert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");
	}

	public static void refresh(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");

	}
}
