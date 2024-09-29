package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver = new ChromeDriver();
		
		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String title = driver.getTitle();
		System.out.println(title);
		//driver.close(); //close only the last opened window
		driver.quit(); //closes all the windows open
		
	}

}
