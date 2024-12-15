package day22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTestingDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless=new");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		System.out.println("Headless Browser Testing");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}

}
