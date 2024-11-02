package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://academy.swaroopnadella.com");
		
		driver.close(); //closes the current window open
		
		driver.quit(); //close all the open windows
		
		//driver.close(); //second time close() method
		
		driver.quit();

	}

}
