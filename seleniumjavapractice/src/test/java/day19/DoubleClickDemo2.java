package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement text = driver.findElement(By.id("demo"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(text).perform();
		
	}

}
