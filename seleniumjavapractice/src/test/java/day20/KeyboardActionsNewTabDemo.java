package day20;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsNewTabDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		WebElement webinars = driver.findElement(By.linkText("Webinars"));
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(webinars)
		.keyUp(Keys.CONTROL).perform();
		
		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		
		//Webinars window switching
		System.out.println("Webinars Page Information");
		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().frame("mfeIFrame");
		
		String text = driver.findElement(By.cssSelector("p.text-body")).getText();
		System.out.println(text);
		
		//Switching to Parent tab - Home page
		System.out.println("Home Page Information");
		driver.switchTo().window(windows.get(0));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
