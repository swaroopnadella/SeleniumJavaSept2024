package day37;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridDemo_MultipleBrowsers {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		chromeBrowserTest();
		firefoxBrowserTest();
		edgeBrowserTest();	
	}
	
	public static void chromeBrowserTest() throws URISyntaxException, MalformedURLException {
		URI hubURI = new URI("http://localhost:4444/");
		URL hubUrl = hubURI.toURL();
		
		//Chrome Browser
		ChromeOptions options = new ChromeOptions();
		
		//Control + Shift + O - shortcut in Eclipse for Import
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Chrome browser");
		//driver.quit();
	}
	
	public static void edgeBrowserTest() throws URISyntaxException, MalformedURLException {
		URI hubURI = new URI("http://localhost:4444/");
		URL hubUrl = hubURI.toURL();
		
		//Edge Browser
		EdgeOptions options = new EdgeOptions();
		
		//Control + Shift + O - shortcut in Eclipse
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Edge browser");
		//driver.quit();
	}
	
	public static void firefoxBrowserTest() throws URISyntaxException, MalformedURLException {
		URI hubURI = new URI("http://localhost:4444/");
		URL hubUrl = hubURI.toURL();
		
		//Firefox Browser
		FirefoxOptions options = new FirefoxOptions();
		
		//Control + Shift + O - shortcut in Eclipse
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Firefox browser");
		//driver.quit();
	}

}
