package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement wishlist = driver.findElement(By.linkText("Wish List (0)"));
		
		WebElement myAccount = driver.findElement(
				RelativeLocator.with(By.tagName("span")).toLeftOf(wishlist));
		String text = myAccount.getText();
		System.out.println(text);
		
		WebElement shoppingCart = driver.findElement(
				RelativeLocator.with(By.tagName("span")).toRightOf(wishlist));
		String text2 = shoppingCart.getText();
		System.out.println(text2);
		
		WebElement openCartElement = driver.findElement(By.linkText("OpenCart"));
		
		WebElement element = driver.findElement(
				RelativeLocator.with(By.tagName("p")).near(openCartElement));
		System.out.println(element.getText());
		driver.close();
		
	}

}
