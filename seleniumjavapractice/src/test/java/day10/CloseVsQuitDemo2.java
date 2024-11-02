package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseVsQuitDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://academy.swaroopnadella.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		
		driver.close(); //current window is closed - Google
		
		Thread.sleep(5000);
		driver.quit(); //Close all the other windows opened
		
		driver.close(); //second time close() method

	}

}
