package day4;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsDemoOpenCart {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriver driver = new EdgeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize(); //Maximize
		
		WebElement searchBox = driver.findElement(By.name("search"));
		searchBox.sendKeys("phone");
		searchBox.sendKeys(Keys.ENTER); //Keyboard action - Enter key is pressed
		Thread.sleep(20000);
		//WebElement magnifyingGlass = driver.findElement(By.className("fa-solid fa-magnifying-glass"));
		//magnifyingGlass.click();
		
		//WebElement phoneDescription = driver.findElement(By.className("description"));
		//String iphoneText = phoneDescription.getText();
		//System.out.println(iphoneText);
		WebElement phonePrice = driver.findElement(By.className("price"));
		String price = phonePrice.getText();
		System.out.println(price);
		
		
	}

}
