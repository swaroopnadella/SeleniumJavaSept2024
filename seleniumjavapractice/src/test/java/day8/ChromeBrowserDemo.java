package day8;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserDemo {
//Chrome is being controlled by automated test software
//Remove this message in the Chrome browser
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		//options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
		//options.setExperimentalOption("excludeSwitches",Collections.singleton("enable-automation"));
		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://academy.swaroopnadella.com/");
	}

}
