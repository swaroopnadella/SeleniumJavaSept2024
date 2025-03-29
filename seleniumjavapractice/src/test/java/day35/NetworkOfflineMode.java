package day35;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v133.network.Network;

public class NetworkOfflineMode {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Create DevTools session
		DevTools devTools = driver.getDevTools();
		devTools.createSession();
		
		//Optional.empty();
		//No specific value is provided, 
		//means Chrome default settings will be used
		
		//Command for Network domain
		devTools.send(Network.enable(Optional.empty(), 
				Optional.empty(), 
				Optional.empty()));
		
		devTools.send(Network.emulateNetworkConditions(
				true, //true means Network is Offline mode - Disconnected
				100, //Latency in milli seconds - Irrelevant
				0, //Download Speed, 0 means no limit on the Speed - Irrelevant
				0, //Upload Speed, 0 means no limit on the Speed - Irrelevant
				Optional.empty(), 
				Optional.empty(), 
				Optional.empty(), 
				Optional.empty()));
		
		//Add Listener to check the Network Loading or not
		devTools.addListener(Network.loadingFailed(), 
				 loadingFailed -> {
					System.out.println("Error text: "+loadingFailed.getErrorText());
					System.out.println("Request ID: "+loadingFailed.getRequestId());
					System.out.println("-------------");
				});
		
		try {
			driver.get("https://academy.swaroopnadella.com/");
			
			System.out.println(driver.getTitle());
			//driver.quit();
		}
		catch (Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}
}
