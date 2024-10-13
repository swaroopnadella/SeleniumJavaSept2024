package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathLocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("standard_user");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@value=\"Login\"]")).click();
		
		String text = driver.findElement(By.xpath("//span[@class=\"title\"]")).getText();
		System.out.println(text);
		
		driver.close();
	}

}
