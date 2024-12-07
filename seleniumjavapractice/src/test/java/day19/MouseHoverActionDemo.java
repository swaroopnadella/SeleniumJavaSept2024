package day19;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActionDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement men = driver.findElement(By.xpath("//div[@class=\"desktop-navContent\"]//a[text()='Men']"));
		WebElement tshirts = driver.findElement(By.xpath("//div[@class=\"desktop-categoryContainer\"]//a[text()='T-Shirts']"));
		
		Actions actionsObject = new Actions(driver);
		
		//actionsObject.moveToElement(men).build().perform();
		actionsObject.moveToElement(men).perform();
		
		tshirts.click();
		
		String text = driver.findElement(By.xpath("//div[@class=\"product-productMetaInfo\"]/h3")).getText();
		System.out.println(text);
		
		String text2 = driver.findElement(By.xpath("//div[@class=\"product-productMetaInfo\"]/h4")).getText();
		System.out.println(text2);
	}

}
