package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.tagName("h1"));
		System.out.println(element.getText());
		
		//Page Refresh
		driver.navigate().refresh();
		
		//StaleElementReferenceException
		//System.out.println(element.getText());
		
		//Re-initialize the WebElement using driver.findElement("");
		element = driver.findElement(By.tagName("h1"));
		System.out.println(element.getText());
		
		driver.quit();
	}

}
