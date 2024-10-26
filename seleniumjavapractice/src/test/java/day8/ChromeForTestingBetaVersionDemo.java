package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeForTestingBetaVersionDemo {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("beta");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://academy.swaroopnadella.com/");

	}

}
