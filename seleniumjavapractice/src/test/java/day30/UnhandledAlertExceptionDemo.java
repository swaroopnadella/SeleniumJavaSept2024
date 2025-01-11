package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement element1 = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
		element1.click();
		//JS Alert is opened
		//driver.switchTo().alert().accept();
		
		//UnhandledAlertException
		WebElement element2 = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
		element2.click();
	}

}
