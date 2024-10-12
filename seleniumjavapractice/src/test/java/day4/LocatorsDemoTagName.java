package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemoTagName {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> elements = driver.findElements(By.tagName("footer"));
		int size = elements.size();
		System.out.println(size);
		
		driver.close();

	}

}
