package day13;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeoutDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Web Page loading
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		//Asynchronous script 
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		
		//WebElement level
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println(driver.getTitle());
	}

}
