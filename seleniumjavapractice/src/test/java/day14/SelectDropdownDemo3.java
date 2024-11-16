package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDemo3 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropdownMonth = new Select(month);
		//dropdownMonth.selectByVisibleText("Dec");
		//dropdownMonth.selectByIndex(11); //Dec - index 11
		dropdownMonth.selectByValue("10");
		
		//Retrieve the options in the dropdown
		List<WebElement> options = dropdownMonth.getOptions();
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
