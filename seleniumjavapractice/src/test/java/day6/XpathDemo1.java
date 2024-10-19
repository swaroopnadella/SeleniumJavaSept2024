package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		//Single Attribute value
		//WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		
		//Multiple Attribute value
		//WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\"][@placeholder=\"Username\"]"));
		
		//Wild card * tagname
		//WebElement username = driver.findElement(By.xpath("//*[@id='user-name']"));
		
		//and or operator
		//WebElement username = driver.findElement(By.xpath("//input[@id=\"user-name\" or @type=\"text\"]"));
		
		WebElement swaglabs = driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
		String textVal = swaglabs.getText();
		System.out.println(textVal);
		//username.sendKeys("SwaroopNadella");
	}

}
