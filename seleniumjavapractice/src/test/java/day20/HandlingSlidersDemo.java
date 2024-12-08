package day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSlidersDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[1]"));
		System.out.println(min_slider.getLocation()); //(59, 289)
		
		WebElement max_slider = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[2]"));
		System.out.println(max_slider.getLocation());//(510, 289)
		
		Actions actions = new Actions(driver);
		actions.dragAndDropBy(min_slider,200, 0).perform();
		System.out.println(min_slider.getLocation()); //(257, 289)
		
		actions.dragAndDropBy(max_slider,-200, 0).perform();
		System.out.println(max_slider.getLocation()); //(311, 289)
	}

}
