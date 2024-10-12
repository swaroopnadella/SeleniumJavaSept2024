package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeExample {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement element = driver.findElement(By.className("img-fluid"));
		String text = element.getAttribute("title");
		System.out.println(text);
		
		WebElement searchBox = driver.findElement(By.name("search"));
		String classValue = searchBox.getAttribute("class");
		System.out.println(classValue);
		
		String placeHolderValue = searchBox.getAttribute("placeholder");
		System.out.println(placeHolderValue);

		driver.close();
	}

}
