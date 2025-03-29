package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class BrowserDemo {

	public static void main(String[] args) {
		
		//Launching browser and working on it
		//ChromeDriver driver = new ChromeDriver();
		
		//Cross Browser testing
		WebDriver driver = new ChromeDriver(); //Chrome browser
		driver = new EdgeDriver(); //Edge browser
		driver = new FirefoxDriver(); //Firefox browser
		//driver = new ChromiumDriver();
		//driver = new SafariDriver();
		//driver = new RemoteWebDriver(null); //Selenium Grid
		
		driver.get("https://academy.swaroopnadella.com");		
		
	}
}
