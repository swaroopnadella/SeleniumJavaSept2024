package day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
		
		Thread.sleep(5000); // visualize whether click is happening
		
		//Approach1
		/*
		for(int i=0;i<checkboxes.size();i++) {
			WebElement checkbox = checkboxes.get(i);
			//System.out.println("Initial status: "+checkbox.isSelected());
			if(!checkbox.isSelected()) //checkbox is not selected
				checkbox.click();
			//System.out.println("Final status: "+checkbox.isSelected());
		} */
		
		//Approach2
		for(WebElement checkbox:checkboxes) {
			if(!checkbox.isSelected()) //checkbox is not selected
				checkbox.click();
		}
		
		driver.quit();

	}

}
