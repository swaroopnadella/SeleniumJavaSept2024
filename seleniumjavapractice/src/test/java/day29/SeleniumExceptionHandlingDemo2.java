package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExceptionHandlingDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://academy.swaroopnadella.com/");
			driver.manage().window().maximize();
			
			//InvalidSelectorException - xpath is missing ]
			//String text = driver.findElement(By.xpath("//div[@class=\"display\"")).getText();
			
			//InvalidSelectorException - cssSelector is having double ..
			String text = driver.findElement(By.cssSelector("div..display")).getText();
			
			
			System.out.println(text);
			
			
		}
		catch(Exception e) {
			System.out.println(e.getClass().toString());
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally
		{
			driver.quit();
		}
	}

}
