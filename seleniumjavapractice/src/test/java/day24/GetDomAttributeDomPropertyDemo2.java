package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDomAttributeDomPropertyDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//Example - Attribute exists, property is null
		//System.out.println(loginButton.getAttribute("class")); //Attribute
		//System.out.println(loginButton.getDomAttribute("class")); //Attribute
		//System.out.println(loginButton.getDomProperty("class")); //Property
		
		//Example - 
		//System.out.println(loginButton.getAttribute("namespaceURI")); //Property
		System.out.println(loginButton.getDomAttribute("namespaceURI")); //Attribute
		System.out.println(loginButton.getDomProperty("namespaceURI")); //Property
		
		driver.quit();
		
	}

}
