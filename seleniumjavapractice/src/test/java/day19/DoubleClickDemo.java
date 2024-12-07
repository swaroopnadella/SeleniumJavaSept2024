package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement textbox1 = driver.findElement(By.id("field1"));
		//WebElement textbox2 = driver.findElement(By.id("field2"));
		WebElement button = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		
		textbox1.clear();
		textbox1.sendKeys("Double Click Testing");
		
		Actions actions = new Actions(driver);
		actions.doubleClick(button).perform();
		
	}

}
