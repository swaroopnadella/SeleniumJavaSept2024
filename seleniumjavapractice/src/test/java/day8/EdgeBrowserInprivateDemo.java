package day8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class EdgeBrowserInprivateDemo {

	public static void main(String[] args) {
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://academy.swaroopnadella.com/");

	}

}
