package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_Demo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://books-pwakit.appspot.com/");
		driver.manage().window().maximize();
		
		SearchContext shadowRootElement = driver.findElement(
				By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		shadowRootElement.findElement(By.id("input")).sendKeys("Swaroop");		

	}

}
