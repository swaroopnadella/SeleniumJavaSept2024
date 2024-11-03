package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//Explicit wait Declaration
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//usage
		WebElement userNameTextbox = mywait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.name("username")));
		userNameTextbox.sendKeys("SwaroopN");
		
		WebElement passwordTextbox = mywait.until(
				ExpectedConditions.visibilityOfElementLocated(
						By.name("password")));
		passwordTextbox.sendKeys("Test12345");

		
		//driver.findElement(By.name("username")).sendKeys("SwaroopNadella");
		//driver.findElement(By.name("password")).sendKeys("Test12345");
		
	}

}
