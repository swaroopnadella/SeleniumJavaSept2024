package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickActionDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions actionsObj = new Actions(driver);
		
		//Performing the Right click
		actionsObj.contextClick(button).build().perform();
		
		//Thread.sleep(3000);
		
		//Click on the Copy option in the Context menu
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		
		//Thread.sleep(3000);
		//handle the JS Alert
		driver.switchTo().alert().accept();
			
		
	}

}
