package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String loginUserNames = driver.findElement(By.id("login_credentials")).getText();
		System.out.println(loginUserNames);
		
		String passwordValue = driver.findElement(By.className("login_password")).getText();
		System.out.println(passwordValue);
		
		//String divText = driver.findElement(By.tagName("div")).getText();
		//System.out.println(divText);
		
		
	}

}
