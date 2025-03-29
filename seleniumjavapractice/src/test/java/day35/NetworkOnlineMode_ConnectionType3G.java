package day35;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v133.network.Network;
import org.openqa.selenium.devtools.v133.network.model.ConnectionType;

public class NetworkOnlineMode_ConnectionType3G {

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
				false, //false means Network is Online mode - Connected
				500, //Latency in milli seconds
				2000000, //2mbps Download Speed
				2000000, //2mbps Upload Speed
				Optional.of(ConnectionType.CELLULAR3G), 
				Optional.empty(), 
				Optional.empty(), 
				Optional.empty()));
		
		//Add Listener to check the Network Loading or not
		devTools.addListener(Network.loadingFinished(), 
				 loadingFinished -> {
					System.out.println("Request ID: "+loadingFinished.getRequestId());
					System.out.println("Timestamp: "+loadingFinished.getTimestamp());
					System.out.println("-------------");
				});
		
		try {
			long startTime = System.currentTimeMillis();
			driver.get("https://academy.swaroopnadella.com/");
			
			System.out.println(driver.getTitle());
			long stopTime = System.currentTimeMillis();
			long timeTaken = stopTime - startTime;
			System.out.println("Time taken in ms: "+timeTaken);
			
			//Cellular 3G - Time taken in ms: 3844
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
