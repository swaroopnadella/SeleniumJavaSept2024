package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionVsActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actionsObj = new Actions(driver);
		
		//Performing the Right click
		//actionsObj.contextClick(button).build().perform();
		
		//Creates an Action using the build() method
		Action actionObject = actionsObj.contextClick(button).build();
		
		//Executes the Action using the perform() method
		actionObject.perform();
		
		Thread.sleep(2000);
		//Click on the Copy option in the Context menu
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		Thread.sleep(2000);
		//handle the JS Alert
		driver.switchTo().alert().accept();
	}

}
