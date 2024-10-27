package day9;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://academy.swaroopnadella.com/");
		
		//operations - click - multiple browser window sessions
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		//String currentWindow = driver.getWindowHandle(); 
		//It returns the current window
		
		//System.out.println(currentWindow);
		//68AEE2D105E88CAEC3E9DE1182E973EE
		//BA2BF54C76E80F245820B3AB8DF4152F
		//FAC13B18EFFEC63E79E7EB8BB20E2D2A
		driver.close();
		
	}

}
