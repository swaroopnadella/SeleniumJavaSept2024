package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("div"));
		
		for(WebElement x:list) {
			System.out.println(x.getText());
		}
		
		driver.close();
	}

}
