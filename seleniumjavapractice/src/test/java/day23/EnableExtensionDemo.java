package day23;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionDemo {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		File crxfile = new File("C:\\Users\\SwaroopNadella\\OneDrive\\Desktop\\AdBlock.crx");
		options.addExtensions(crxfile);
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
	}

}
