package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementClickInterceptedExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement flightBookings = driver.findElement(
				By.xpath("//span[text()='Flight Bookings']"));
		
		//Mouse Hover on the Login - Login dropdown will be opened
		WebElement login = driver.findElement(
				By.xpath("//span[text()='Login']"));
		Actions actionsObject = new Actions(driver);
		actionsObject.moveToElement(login).perform();
		
		//ElementClickInterceptedException
		//flightBookings.click();
		
		//Fix the click operation using JavascriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", flightBookings);
		
		//Flight Booking will get clicked with JS execute script
		
	}

}
