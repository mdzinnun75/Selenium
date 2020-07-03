package DropDownSorting;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class VarifyDropDownSortedOptions {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","C:\\Users\\MD.ZINNUN UDDIN\\SDET\\SDET\\Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("http://testautomationpractice.blogspot.com/");
		// driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//select[@id='animals']"));
		Select se = new Select(element);

		/*
		List actList= new ArrayList();
		List sortableList=  new ArrayList();

		List<WebElement> options = se.getOptions();

		for (WebElement x : options) {
			actList.add(x.getText());
			sortableList.add(x.getText());
		}
		System.out.println(actList);

		System.out.println("before soritng " + sortableList);

		Collections.sort(sortableList);
		System.out.println("after soritng " + sortableList);

		if (actList.equals(sortableList)) {
			System.out.println("Sorted!!");
		} else {
			System.out.println("Not Sorted!");
		} */

		driver.close();
	}

}
