package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOutExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		//TimeoutException
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("swaroop")));
		System.out.println(element.getText());
		driver.quit();
	}

}
