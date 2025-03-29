package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		
		String browser = "firefox";
		//Scanner sc = new Scanner(System.in);
		//String browser = sc.next();
		
		WebDriver driver; //driver reference variable
		
		switch (browser.toUpperCase()) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "EDGE":
			driver = new EdgeDriver();
			break;
		case "SAFARI":
			driver = new SafariDriver();
		default:
			driver = new ChromeDriver();
		}
		
		//driver.get("https://academy.swaroopnadella.com/");
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		String websiteURL = driver.getCurrentUrl();
		System.out.println(websiteURL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		driver.close(); //close the browser window
		
		
		
	}

}
