package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserIncognitoMode {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito","--start-maximized");
		//options.addArguments("--incognito");
		//options.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://academy.swaroopnadella.com/");
	}

}
