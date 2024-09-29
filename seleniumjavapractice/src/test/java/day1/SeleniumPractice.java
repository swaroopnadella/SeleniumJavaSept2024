package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumPractice {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("");
		//driver.get("https://www.selenium.dev/");
		driver.get("https://academy.swaroopnadella.com/");
		//driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close(); //close will close the current window
		//driver.quit(); //quit will close the multiple windows
		
		
	}

}