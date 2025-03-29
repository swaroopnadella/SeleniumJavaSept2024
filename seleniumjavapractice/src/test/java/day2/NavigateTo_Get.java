package day2;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo_Get {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		//Load the website
		//driver.get("https://academy.swaroopnadella.com/");
		driver.navigate().to("https://academy.swaroopnadella.com/");
		
	}
}
