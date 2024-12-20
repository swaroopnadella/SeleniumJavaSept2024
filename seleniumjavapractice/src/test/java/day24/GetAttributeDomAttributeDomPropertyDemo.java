package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeDomAttributeDomPropertyDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement textbox = driver.findElement(By.id("name"));
		
		//Example 1 - Attribute exists, but Property is null
		//System.out.println(textbox.getAttribute("class")); //picked the Attribute
		//System.out.println(textbox.getDomAttribute("class")); //Attribute
		//System.out.println(textbox.getDomProperty("class")); //Property
		System.out.println("***********");
		
		//Example 2 - Property exists, Attribute is null
		//System.out.println(textbox.getAttribute("value")); //picked the Property
		System.out.println(textbox.getDomAttribute("value")); //Attribute-null
		System.out.println(textbox.getDomProperty("value")); //Property is Empty
		System.out.println("************");
		
		//Example 3 - Enter text "Swaroop" into Textbox
		textbox.sendKeys("Swaroop");
		//System.out.println(textbox.getAttribute("value")); //Property
		System.out.println(textbox.getDomAttribute("value")); //Attribute
		System.out.println(textbox.getDomProperty("value")); //Property
		
		driver.quit();
		
	}

}
