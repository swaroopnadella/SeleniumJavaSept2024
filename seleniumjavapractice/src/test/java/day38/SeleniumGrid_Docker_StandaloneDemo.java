package day38;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid_Docker_StandaloneDemo {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
		chromeBrowserTest();
		edgeBrowserTest();
		firefoxBrowserTest();
	}
	
	public static void chromeBrowserTest() throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:4444/");
		URL hubUrl = hubURI.toURL();
		
		//Chrome Browser
		ChromeOptions options = new ChromeOptions();
		
		//Control + Shift + O - shortcut in Eclipse for Import
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Chrome browser - Docker Container");
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void edgeBrowserTest() throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:4445/");
		URL hubUrl = hubURI.toURL();
		
		//Edge Browser
		EdgeOptions options = new EdgeOptions();
		
		//Control + Shift + O - shortcut in Eclipse
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Edge browser - Docker Container");
		Thread.sleep(2000);
		driver.quit();
	}
	
	public static void firefoxBrowserTest() throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:4446/");
		URL hubUrl = hubURI.toURL();
		
		//Firefox Browser
		FirefoxOptions options = new FirefoxOptions();
		
		//Control + Shift + O - shortcut in Eclipse
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Firefox browser - Docker Container");
		Thread.sleep(2000);
		driver.quit();
	}

}
