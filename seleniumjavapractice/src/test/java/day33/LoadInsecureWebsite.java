package day33;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v133.security.Security;

public class LoadInsecureWebsite {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		//Create DevTools Object
		DevTools devTools = driver.getDevTools();
		//Create Session
		devTools.createSession();
		
		devTools.send(Security.setIgnoreCertificateErrors(true));
		
		//Launch the Website
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	
	}
}
