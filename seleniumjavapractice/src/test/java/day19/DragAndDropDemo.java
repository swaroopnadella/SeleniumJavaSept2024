package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://ui.vision/demo/webtest/dragdrop/");
		driver.manage().window().maximize();
		
		//source
		WebElement firstElement = driver.findElement(By.id("one"));
		WebElement secondElement = driver.findElement(By.id("two"));
		WebElement thirdElement = driver.findElement(By.id("three"));
		WebElement fourthElement = driver.findElement(By.id("four"));
		WebElement fifthElement = driver.findElement(By.id("five"));
		
		//target
		WebElement target = driver.findElement(By.id("bin"));
		
		Thread.sleep(2000);
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(firstElement, target).perform();
		actions.dragAndDrop(secondElement, target).perform();
		actions.dragAndDrop(thirdElement, target).perform();
		actions.dragAndDrop(fourthElement, target).perform();
		actions.dragAndDrop(fifthElement, target).perform();
	}

}
