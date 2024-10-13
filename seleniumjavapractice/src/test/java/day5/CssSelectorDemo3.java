package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorDemo3 {

	// tag[attribute='value']
	// tag.class[attribute='value']
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.cssSelector("input.form_input[placeholder='Password']"));
		password.sendKeys("secret_sauce");
		
		WebElement loginButton = driver.findElement(By.cssSelector("input[type=\"submit\"]"));
		loginButton.click();
		
		WebElement products = driver.findElement(By.cssSelector(".title"));
		String text = products.getText();
		System.out.println(text);
		
		driver.close();
	}

}
