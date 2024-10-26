package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//Google Chrome normal browser is already installed
public class ChromeforTestingStableDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\SwaroopNadella\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://academy.swaroopnadella.com/");


	}

}
