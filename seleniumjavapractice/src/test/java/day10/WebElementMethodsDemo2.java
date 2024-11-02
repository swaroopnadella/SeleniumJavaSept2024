package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://academy.swaroopnadella.com");
		
		//isEnabled()
		WebElement LoginButton = driver.findElement(
				By.xpath("//*[contains(@class,'loginBtn')]"));
		System.out.println(LoginButton.isEnabled());
		
		driver.close();		
		
	}

}
