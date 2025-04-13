package day39;

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
		chromeBrowserTest("4441","First Container");
		chromeBrowserTest("4442","Second Container");
		chromeBrowserTest("4443","Third Container");
		chromeBrowserTest("4444","Fourth Container");
		chromeBrowserTest("4445","Fifth Container");
		edgeBrowserTest("4451","First Container");
		edgeBrowserTest("4452","Second Container");
		edgeBrowserTest("4453","Third Container");
		edgeBrowserTest("4454","Fourth Container");
		edgeBrowserTest("4455","Fifth Container");
		firefoxBrowserTest("4461","First Container");
		firefoxBrowserTest("4462","Second Container");
		firefoxBrowserTest("4463","Third Container");
		firefoxBrowserTest("4464","Fourth Container");
		firefoxBrowserTest("4465","Fifth Container");
		System.out.println("Execution Completed!");
	}
	
	public static void chromeBrowserTest(String port, String containerName) throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:"+port+"/");
		URL hubUrl = hubURI.toURL();
		
		//Chrome Browser
		ChromeOptions options = new ChromeOptions();
		
		//Control + Shift + O - shortcut in Eclipse for Import
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Chrome browser - Docker Container");
		System.out.println(containerName+" - Chrome");
		System.out.println("-----------------");
		//Thread.sleep(2000);
		driver.quit();
	}
	
	public static void edgeBrowserTest(String port, String containerName) throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:"+port+"/");
		URL hubUrl = hubURI.toURL();
		
		//Edge Browser
		EdgeOptions options = new EdgeOptions();
		
		//Control + Shift + O - shortcut in Eclipse
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Edge browser - Docker Container");
		System.out.println(containerName+" - Edge");
		System.out.println("-----------------");
		//Thread.sleep(2000);
		driver.quit();
	}
	
	public static void firefoxBrowserTest(String port, String containerName) throws URISyntaxException, MalformedURLException, InterruptedException {
		URI hubURI = new URI("http://localhost:"+port+"/");
		URL hubUrl = hubURI.toURL();
		
		//Firefox Browser
		FirefoxOptions options = new FirefoxOptions();
		
		//Control + Shift + O - shortcut in Eclipse
		WebDriver driver = new RemoteWebDriver(hubUrl,options);
		driver.get("https://academy.swaroopnadella.com");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("Selenium Grid execution for Firefox browser - Docker Container");
		System.out.println(containerName+" - Firefox");
		System.out.println("-----------------");
		//Thread.sleep(2000);
		driver.quit();
	}

}
