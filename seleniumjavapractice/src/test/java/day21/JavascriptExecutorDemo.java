package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//WebElement textbox = driver.findElement(By.id("name"));
		//textbox.sendKeys("Swaroop Nadella");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//1) sendKeys approach with JavascriptExecutor
		//js.executeScript("arguments[0].setAttribute('value','Swaroop Nadella Academy')", textbox);
		
		//2) click operation using JS Executor
		WebElement radioButton = driver.findElement(By.id("male"));
		//radioButton.click();
		
		js.executeScript("arguments[0].click()", radioButton);
		
		
		
	}

}
