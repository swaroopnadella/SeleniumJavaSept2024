package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://academy.swaroopnadella.com/");

	}

}
