package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		WebElement textarea1 = driver.findElement(By.id("inputText1"));
		textarea1.sendKeys("SWAROOP NADELLA");
		
		Actions actionsObject = new Actions(driver);
		
		//Control +A - Select All
		actionsObject.keyDown(Keys.CONTROL).sendKeys("A")
		.keyUp(Keys.CONTROL).perform();
		
		//Control + C - Copy
		actionsObject.keyDown(Keys.CONTROL).sendKeys("C")
		.keyUp(Keys.CONTROL).perform();
		
		//Tab
		actionsObject.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		
		//Control + V - Paste
		actionsObject.keyDown(Keys.CONTROL).sendKeys("V")
		.keyUp(Keys.CONTROL).perform();
		
		
	}

}
