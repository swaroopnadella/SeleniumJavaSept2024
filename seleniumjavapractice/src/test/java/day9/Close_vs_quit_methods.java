package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_vs_quit_methods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		//Two browser tabs are open
		
		Thread.sleep(5000);
		driver.close(); //closing the current browser tab
		//driver.quit(); //all browser tabs will be closed
		
		driver.close();
		
	}

}
