package day36;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		
		//Java 20 - URL constructor is deprecated
		//URL gridUrl = new URL("http://localhost:4444/");
		URI gridURI = new URI("http://localhost:4444/");
		URL gridUrl = gridURI.toURL();
		
		//Chrome Browser
		ChromeOptions options = new ChromeOptions();
		
		//Control + Shift + O - shortcut in Eclipse
		WebDriver driver = new RemoteWebDriver(gridUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
