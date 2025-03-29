package day9;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windows = driver.getWindowHandles(); 
		//return multiple window handles opened
		
		System.out.println(windows);
		
		for(String windowId:windows) {
			driver.switchTo().window(windowId);
			System.out.println(driver.getTitle());
			
			//if(driver.getTitle().equals("OrangeHRM") 
				//	|| driver.getTitle().equals("TestTitle1")
				//	|| driver.getTitle().equals("TestTitle2"))
			if(driver.getTitle().equals("Human Resources Management Software | OrangeHRM"))
				driver.close();
		}
		
		
		
		
		
		
		
		
		
		
	}
	

}
