package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptionHandlingDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://academy.swaroopnadella.com/");
			driver.manage().window().maximize();
			
			WebElement element = driver.findElement(By.tagName("h1"));
			System.out.println(element.getText());
			
			//Page Refresh
			driver.navigate().refresh();
			
			//StaleElementReferenceException
			System.out.println(element.getText());
			
			
			
		}
		catch(StaleElementReferenceException e) { 
			//Executed only with StaleElementReferenceException happens
			//Re-initialize the WebElement using driver.findElement("");
			WebElement element = driver.findElement(By.tagName("h1"));
			System.out.println(element.getText());
			
		}
		catch (Exception e) { //Executed only when exception happens
			// TODO: handle exception
		}
		finally { //Always executed
			driver.quit();
		}
	}

}
