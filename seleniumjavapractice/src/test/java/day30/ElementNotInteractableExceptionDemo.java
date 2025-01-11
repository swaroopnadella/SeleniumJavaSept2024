package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotInteractableExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();
		
		//ElementNotInteractableException
		//WebElement whereTo = driver.findElement(
		//		By.className("uitk-field-input"));
		//whereTo.sendKeys("New York");
		
		WebElement whereTo = driver.findElement(
				By.xpath("//button[@aria-label=\"Where to?\"]"));
		whereTo.click();
		
		WebElement goingTo = driver.findElement(
				By.xpath("//input[@placeholder=\"Going to\"]"));
		goingTo.sendKeys("New York");
	}

}
