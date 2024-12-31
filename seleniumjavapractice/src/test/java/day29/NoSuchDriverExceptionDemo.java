package day29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchDriverExceptionDemo {

	public static void main(String[] args) {
		
		//NoSuchDriverException
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SwaroopNadella\\git\\SeleniumJavaSept2024\\seleniumjavapractice\\src\\test\\resources\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		
	}

}
