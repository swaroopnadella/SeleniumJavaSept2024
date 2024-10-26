package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeforTestingDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("131.0.6778.13");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://academy.swaroopnadella.com/");
		

	}

}
