package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDemo2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select dropdownDay = new Select(day);
		//dropdownDay.selectByVisibleText("25");
		//dropdownDay.selectByIndex(30); // day as 31
		dropdownDay.selectByValue("9");
		
		//Retrieve the options in the dropdown
		List<WebElement> options = dropdownDay.getOptions();
		System.out.println(options.size());
		
		//Regular for loop with index
		/*
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}*/
		
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		
		

	}

}
