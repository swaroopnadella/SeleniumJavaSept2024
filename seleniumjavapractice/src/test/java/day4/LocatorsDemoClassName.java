package day4;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemoClassName {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> footer = driver.findElements(By.className("col-sm-3"));
		System.out.println(footer.size());
		for(WebElement column:footer) {
			System.out.println(column.getText());
		}
		
	}

}
