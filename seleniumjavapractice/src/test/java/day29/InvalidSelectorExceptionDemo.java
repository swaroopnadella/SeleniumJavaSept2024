package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidSelectorExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		//InvalidSelectorException - xpath is missing ]
		//String text = driver.findElement(By.xpath("//div[@class=\"display\"")).getText();
		
		//InvalidSelectorException - cssSelector is having double ..
		String text = driver.findElement(By.cssSelector("div..display")).getText();
		
		
		System.out.println(text);
		
		driver.quit();
	}

}
