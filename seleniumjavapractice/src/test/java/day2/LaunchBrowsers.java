package day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowsers {

	public static void main(String[] args) {
		
		//Chrome browser
		//ChromeDriver driver = new ChromeDriver();
		
		//Edge browser
		//EdgeDriver driver = new EdgeDriver();
		
		//Firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		
		//Load the website
		driver.get("https://academy.swaroopnadella.com/");
		
		String title = driver.getTitle(); //Get title of website
		System.out.println(title);
		
		driver.manage().window().maximize(); //Maximize window
		//driver.close(); //Closing single window
		
		
	}

}
