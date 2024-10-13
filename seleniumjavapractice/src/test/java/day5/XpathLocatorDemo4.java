package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocatorDemo4 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		System.out.println(elements.size());
		
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
		
		driver.close();
	}

}
