package day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlineDemo2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//String currentWindow = driver.getWindowHandle();
		//System.out.println(currentWindow);
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//String currentWindow2 = driver.getWindowHandle();
		//System.out.println(currentWindow2);
		
		Set<String> windows = driver.getWindowHandles(); 
		//return multiple window handles opened
		
		System.out.println(windows);
		
		//Approach 1
		//Converting Set to List object
		/*
		List<String> windowsList = new ArrayList<>(windows);
		String window1 = windowsList.get(0);
		System.out.println(window1);
		String window2 = windowsList.get(1);
		System.out.println(window2);
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());	
		*/
		
		//Approach2
		
		for(String windowId:windows) {
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equals("OrangeHRM") 
					|| driver.getTitle().equals("TestTitle1")
					|| driver.getTitle().equals("TestTitle2"))
			//if(driver.getTitle().equals("Human Resources Management Software | OrangeHRM"))
				driver.close();
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
