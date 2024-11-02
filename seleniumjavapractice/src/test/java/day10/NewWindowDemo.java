package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Parent window
		driver.get("https://academy.swaroopnadella.com");
		System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//Child window
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.close(); //closed the Child window
		//System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

	}

}
