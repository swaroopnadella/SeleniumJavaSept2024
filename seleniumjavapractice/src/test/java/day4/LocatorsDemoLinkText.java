package day4;

import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemoLinkText {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//WebElement camerasElement = driver.findElement(By.linkText("Cameras"));
		//camerasElement.click();
		//WebElement tabletsElement = driver.findElement(By.linkText("Tablets"));
		WebElement tabletsElement = driver.findElement(By.partialLinkText("Tab"));
		tabletsElement.click();
		
		Thread.sleep(25000);
		//List<WebElement> products = driver.findElements(By.className("description"));
		List<WebElement> productsPrice = driver.findElements(By.className("price"));
		
		for(WebElement  item:productsPrice) {
			System.out.println(item.getText());
		}
	}

}
