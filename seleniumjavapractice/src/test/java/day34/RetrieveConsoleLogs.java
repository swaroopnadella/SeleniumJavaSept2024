package day34;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v133.log.Log;
import org.openqa.selenium.devtools.v133.log.model.LogEntry;

public class RetrieveConsoleLogs {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//Create DevTools Session
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		devTools.send(Log.enable());
		
		//Add Listener for Console Logs
		devTools.addListener(
				Log.entryAdded(), //event - release some output
				(LogEntry entry) -> {
					System.out.println("Log Text: "+entry.getText());
					System.out.println("Level: "+entry.getLevel()); //Error, Info, Warning
					System.out.println("URL: "+entry.getUrl());
					System.out.println("----------");
				} );
		
		driver.get("https://the-internet.herokuapp.com/broken_images");
		
		//Thread.sleep(2000);
		driver.quit();
	}
}
