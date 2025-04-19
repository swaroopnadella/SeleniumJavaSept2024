package day40;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid_Docker_HubAndNodesDemo {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException, InterruptedException {
		chromeBrowserTest("First Container");
		chromeBrowserTest("Second Container");
		chromeBrowserTest("Third Container");
		chromeBrowserTest("Fourth Container");
		chromeBrowserTest("Fifth Container");
		edgeBrowserTest("First Container");
		edgeBrowserTest("Second Container");
		edgeBrowserTest("Third Container");
		edgeBrowserTest("Fourth Container");
		edgeBrowserTest("Fifth Container");
		firefoxBrowserTest("First Container");
		firefoxBrowserTest("Second Container");
		firefoxBrowserTest("Third Container");
		firefoxBrowserTest("Fourth Container");
		firefoxBrowserTest("Fifth Container");
		System.out.println("Execution Completed!");
	}
	
	public static void chromeBrowserTest(String containerName) throws URISyntaxException, MalformedURLException, InterruptedException {
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
		System.out.println(containerName+" - Chrome");
		System.out.println("-----------------");
		Thread.sleep(2000);
		//driver.quit();
	}
	
	public static void edgeBrowserTest(String containerName) throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:4444/");
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
		System.out.println(containerName+" - Edge");
		System.out.println("-----------------");
		Thread.sleep(2000);
		//driver.quit();
	}
	
	public static void firefoxBrowserTest(String containerName) throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:4444/");
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
		System.out.println(containerName+" - Firefox");
		System.out.println("-----------------");
		Thread.sleep(2000);
		//driver.quit();
	}

}
