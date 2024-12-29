package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOM_Demo2_NestedElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://dev.automationtesting.in/shadow-dom");
		driver.manage().window().maximize();
		
		SearchContext parentShadowRootElement = driver.findElement(
				By.cssSelector("div#shadow-root")).getShadowRoot();
		String text = parentShadowRootElement.findElement(By.id("shadow-element")).getText();		
		System.out.println(text);
		
		//Nested Shadow Root Element
		SearchContext childShadowRootElement = parentShadowRootElement.findElement(
				By.cssSelector("#inner-shadow-dom")).getShadowRoot();
		String text2 = childShadowRootElement.findElement(By.id("nested-shadow-element")).getText();
		System.out.println(text2);
		
		//Multi Nested Shadow Root Element
		SearchContext grandChildShadowRootElement = childShadowRootElement.findElement(
				By.cssSelector("#nested-shadow-dom")).getShadowRoot();
		String text3 = grandChildShadowRootElement.findElement(By.id("multi-nested-shadow-element")).getText();
		System.out.println(text3);
		
		driver.quit();
		
	}

}
