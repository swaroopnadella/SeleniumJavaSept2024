package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAxesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//*[@id='password']/parent::div/preceding-sibling::div/child::input"));
		//username.sendKeys("SwaroopNadella");
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"user-name\"]/parent::div/following-sibling::div/child::input"));
		//password.sendKeys("123456");
		password.sendKeys("secret_sauce");
		
		
		
		
	}

}
