package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.linkedin.com/");	
		
		driver.findElement(By.linkText("Join now")).click();
		
		WebElement rememberMe = driver.findElement(By.id("remember-me-checkbox"));
		//System.out.println(rememberMe.isSelected());
		//rememberMe.click();
		//System.out.println(rememberMe.isSelected());
		
		if(!rememberMe.isSelected()) {
			rememberMe.click();
			System.out.println("Click has happened");
		}
		
		
	}

}
