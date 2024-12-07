package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement button  = driver.findElement(By.xpath("//button[text()='Double-click me']"));
		
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		
	}

}
