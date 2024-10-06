package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> list = driver.findElements(By.className("inventory_item_name"));
		
		for(WebElement a:list) {
			System.out.println(a.getText());
		}
		
		List<WebElement> list2 = driver.findElements(By.className("inventory_item_price"));
		
		for(WebElement b:list2) {
			System.out.println(b.getText());
		}
		
		driver.close();
	}

}
