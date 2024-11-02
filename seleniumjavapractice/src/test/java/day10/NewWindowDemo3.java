package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Parent window
		driver.get("https://academy.swaroopnadella.com");
		//System.out.println(driver.getTitle());
		String parentWindow = driver.getWindowHandle();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//Child window
		driver.get("https://www.google.com");
		String childWindow = driver.getWindowHandle();
		//System.out.println(driver.getTitle());
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String windowId:windows) {
			if(windowId.equals(childWindow)) {
				driver.switchTo().window(windowId);
				System.out.println(driver.getTitle());
				driver.close();
			}
		}
		
			
	}

}
