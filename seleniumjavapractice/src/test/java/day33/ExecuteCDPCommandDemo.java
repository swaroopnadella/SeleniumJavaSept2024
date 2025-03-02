package day33;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;

public class ExecuteCDPCommandDemo {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("ignore", true);
		driver.executeCdpCommand("Security.setIgnoreCertificateErrors", map);
		
		//launch the website
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		
		
	}
}
