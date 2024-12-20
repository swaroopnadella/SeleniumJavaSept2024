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

public class BrokenImagesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://academy.swaroopnadella.com/");
		//driver.get("https://the-internet.herokuapp.com/broken_images");
		//driver.get("https://www.google.com/");
		//driver.get("https://www.amazon.com/");
		//driver.get("https://www.myntra.com/");
		//driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of Images: "+images.size());
		System.out.println("**************");
		
		//Printing the Images using Src attribute
		for(WebElement image:images) {
			System.out.println(image.getDomAttribute("src"));
		}
		
		System.out.println("*************");
		
		for(WebElement image:images) {
			checkBrokenImage(image,driver);
		}
		
		driver.quit();
		
	}
	
	 static void checkBrokenImage(WebElement image, WebDriver driver){
		
		try {
			 String srcAttribute = image.getDomAttribute("src");
			 if(srcAttribute == null || srcAttribute.isEmpty() || 
					 srcAttribute.contains("javascript:void")) {
				 System.out.println(srcAttribute+" is Invalid Image, cannot validate this");
				 return;
			 }
			 
			 //Java 20 onwards is deprecated
			 //URL url = new URL(hrefAttribute);
			 String baseURL = driver.getCurrentUrl();
			 URI baseURI = new URI(baseURL);
			 URI relativeURI = new URI(srcAttribute);
			 URI absoluteURI = baseURI.resolve(relativeURI);
			 
			 URL url = absoluteURI.toURL(); //URL - complete URL
			 System.out.println("URL: "+url);
			 
			 //Validations
			 HttpURLConnection connectionURL = (HttpURLConnection) url.openConnection();
			 connectionURL.setRequestMethod("GET");
			 connectionURL.setConnectTimeout(3000);
			 connectionURL.connect();
			 if(connectionURL.getResponseCode()>=400) {
				 System.out.println(srcAttribute+" ===> Broken Image: "
						 +connectionURL.getResponseCode()+" "
						 +connectionURL.getResponseMessage());
			 }
			 else {
				 System.out.println(srcAttribute+" ===> Not Broken Image: "
						 +connectionURL.getResponseCode()+" "
						 +connectionURL.getResponseMessage());
			 }
			 
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
