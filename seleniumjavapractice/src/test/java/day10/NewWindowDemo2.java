package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Parent window
		driver.get("https://academy.swaroopnadella.com");
		System.out.println(driver.getTitle());
		//String parentWindow = driver.getWindowHandle();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//Child window
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		Set<String> windows = driver.getWindowHandles();
		
		//Converting Set to List object
		List<String> windowsList = new ArrayList<>(windows);
		
		String parentWindow = windowsList.get(0);
		//String childWindow = windowsList.get(1);		
		
		driver.close(); //closed the Child window
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());

	}

}
