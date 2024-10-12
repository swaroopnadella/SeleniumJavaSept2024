package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement cart = driver.findElement(By.linkText("Shopping Cart"));
		cart.click();
		
		Thread.sleep(20000);
		String text = driver.findElement(By.id("content")).getText();
		System.out.println(text);
		
		WebElement wishlist = driver.findElement(By.linkText("Wish List (0)"));
		wishlist.click();
		
		Thread.sleep(10000);
		String emailText = driver.findElement(By.id("col-form-label")).getTagName();
		System.out.println(emailText);

	}

}
