package day9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class EdgeBrowserDemo {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--inprivate");
		
		WebDriver driver = new EdgeDriver(options);
		driver.get("https://academy.swaroopnadella.com/");
	}

}
