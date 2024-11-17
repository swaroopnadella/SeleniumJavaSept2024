package day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement multiSelectDropdown = driver.findElement(By.id("colors"));
		Select dropdown = new Select(multiSelectDropdown);
		
		//dropdown.selectByIndex(1);
		//dropdown.selectByIndex(3);
		//dropdown.selectByValue("red");
		//dropdown.selectByValue("yellow");
		
		if(dropdown.isMultiple())
		{
			dropdown.selectByVisibleText("Blue");
			dropdown.selectByVisibleText("White");
			dropdown.selectByVisibleText("Yellow");
		}
		
		//Thread.sleep(3000);
		//dropdown.deselectAll();
		//dropdown.deselectByVisibleText("Blue");
		
		List<WebElement> elements = dropdown.getAllSelectedOptions();
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		//System.out.println(elements.size());
		//System.out.println(dropdown.getWrappedElement().getText());
		//System.out.println(dropdown.isMultiple());
		
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
		
		driver.quit();

	}

}
