package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorDemo {

	//Tag and ID -- tag#id
	//Tag and class -- tag.class
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.cssSelector("input#user-name"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.cssSelector("input#password"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.cssSelector("input#login-button"));
		loginButton.click();
		
		WebElement products = driver.findElement(By.cssSelector("span.title"));
		String text = products.getText();
		System.out.println(text);
		
		driver.close();
	}

}
