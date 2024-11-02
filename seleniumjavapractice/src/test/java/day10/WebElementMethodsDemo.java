package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://academy.swaroopnadella.com");
		
		//IsDisplayed()
		WebElement logo = driver.findElement(By.xpath("//*[@alt='logo']"));
		boolean status = logo.isDisplayed();
		System.out.println(status);
		
		WebElement textLabel = driver.findElement(By.xpath("//h1[text()='Learn with Swaroop Nadella']"));
		System.out.println(textLabel.isDisplayed());
		
		driver.close();
	}

}
