package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class FluentWaitDemo2 {

	public static WebElement fluentWaitUsage(WebDriver driver,Wait<WebDriver> wait,By locator) {
		
		
		WebElement ele = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(locator);
		     }
		   });
		
		return ele;
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//FluentWait declaration
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(10))
			       .pollingEvery(Duration.ofSeconds(2))
			       .ignoring(NoSuchElementException.class);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement username = fluentWaitUsage(driver,wait, By.name("username"));
		username.sendKeys("Admin");
		
		WebElement password = fluentWaitUsage(driver,wait, By.name("password"));
		password.sendKeys("admin123");
		
		WebElement loginButton = fluentWaitUsage(driver,wait, By.xpath("//*[@type='submit']"));
		loginButton.click();
		
		//Validations - getText();
		
		driver.quit();
		
	}

}
