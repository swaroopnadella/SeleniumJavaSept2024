package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateVsGet {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().to("https://academy.swaroopnadella.com/");
		Thread.sleep(2000);
		driver.navigate().back(); //back in the browser history
		Thread.sleep(2000);
		driver.navigate().back(); //back in the browser history
		Thread.sleep(2000);
		driver.navigate().forward(); //forward in the browser history
		Thread.sleep(2000);
		driver.navigate().forward(); //forward in the browser history
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		System.out.println("End of the Program");
		
		driver.close();

	}

}
