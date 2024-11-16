package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDemo4 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dropdownYear = new Select(year);
		//dropdownYear.selectByVisibleText("1995");
		//dropdownYear.selectByIndex(10); //2014 - index 10
		dropdownYear.selectByValue("2017");
		
		//Retrieve the options in the dropdown
		List<WebElement> options = dropdownYear.getOptions();
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
