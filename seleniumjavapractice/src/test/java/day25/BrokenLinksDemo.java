package day25;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://academy.swaroopnadella.com/");
		//driver.get("https://the-internet.herokuapp.com/");
		//driver.get("https://www.google.com/");
		//driver.get("https://www.amazon.com/");
		//driver.get("https://www.myntra.com/");
		//driver.get("https://www.flipkart.com/");
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: "+links.size());
		System.out.println("**************");
		
		//Printing the Links using Href attribute
		for(WebElement link:links) {
			System.out.println(link.getDomAttribute("href"));
		}
		
		System.out.println("*************");
		
		for(WebElement link:links) {
			checkBrokenLink(link,driver);
		}
		
		driver.quit();
		
	}
	
	 static void checkBrokenLink(WebElement link, WebDriver driver){
		
		try {
			 String hrefAttribute = link.getDomAttribute("href");
			 if(hrefAttribute == null || hrefAttribute.isEmpty() || 
					 hrefAttribute.contains("javascript:void")) {
				 System.out.println(hrefAttribute+" is Invalid link, cannot validate this");
				 return;
			 }
			 
			 //Java 20 onwards is deprecated
			 //URL url = new URL(hrefAttribute);
			 String baseURL = driver.getCurrentUrl();
			 URI baseURI = new URI(baseURL);
			 URI relativeURI = new URI(hrefAttribute);
			 URI absoluteURI = baseURI.resolve(relativeURI);
			 
			 URL url = absoluteURI.toURL(); //URL - complete URL
			 System.out.println("URL: "+url);
			 
			 //Validations
			 HttpURLConnection connectionURL = (HttpURLConnection) url.openConnection();
			 connectionURL.setRequestMethod("GET");
			 connectionURL.setConnectTimeout(3000);
			 connectionURL.connect();
			 if(connectionURL.getResponseCode()>=400) {
				 System.out.println(hrefAttribute+" ===> Broken Link: "
						 +connectionURL.getResponseCode()+" "
						 +connectionURL.getResponseMessage());
			 }
			 else {
				 System.out.println(hrefAttribute+" ===> Not Broken Link: "
						 +connectionURL.getResponseCode()+" "
						 +connectionURL.getResponseMessage());
			 }
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
