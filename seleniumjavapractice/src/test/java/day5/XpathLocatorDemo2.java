package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocatorDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		String textValue = driver.findElement(By.xpath("//h4[text()='Password for all users:']")).getText();
		System.out.println(textValue);
		
		driver.close();
	}

}
