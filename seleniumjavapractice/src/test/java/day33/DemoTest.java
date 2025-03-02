package day33;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://academy.swaroopnadella.com");
		System.out.println(driver.getTitle());
	}
}
