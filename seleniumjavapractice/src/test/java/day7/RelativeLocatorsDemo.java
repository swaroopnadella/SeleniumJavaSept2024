package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		//WebElement userName = driver.findElement(By.id("user-name"));
		//WebElement password = driver.findElement(
					//RelativeLocator.with(By.tagName("input")).below(userName));
		//password.sendKeys("Test12345");
		
		WebElement password = driver.findElement(By.id("password"));
		WebElement username = driver.findElement(
				RelativeLocator.with(By.tagName("input")).above(password));
		username.sendKeys("SwaroopNadella");

	}

}
