package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxBrowserDemo {

	public static void main(String[] args) {
		
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--private");
		
		WebDriver driver = new FirefoxDriver(options);
		driver.get("https://academy.swaroopnadella.com/");
	}

}
