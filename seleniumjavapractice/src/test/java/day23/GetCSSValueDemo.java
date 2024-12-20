package day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValueDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//rgba(49, 122, 231, 1)
		System.out.println(loginButton.getCssValue("background-color"));
		System.out.println(loginButton.getCssValue("color"));
		System.out.println(loginButton.getCssValue("font-style"));
		System.out.println(loginButton.getCssValue("font-weight"));
		System.out.println(loginButton.getCssValue("font-size"));
		
		//rgba(49, 122, 231, 1)
		//rgba(255, 255, 255, 1)
		//normal
		//600
		//14px
		
		driver.quit();
	}

}
