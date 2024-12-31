package day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchSessionExceptionDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.quit();
		//driver.close();
		//NoSuchSessionException
		System.out.println(driver.getTitle());
	}

}
