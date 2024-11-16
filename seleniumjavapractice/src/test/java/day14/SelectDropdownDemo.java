package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDemo {

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
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropdownMonth = new Select(month);
		//dropdownMonth.selectByVisibleText("Dec");
		//dropdownMonth.selectByIndex(11); //Dec - index 11
		dropdownMonth.selectByValue("10");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dropdownYear = new Select(year);
		//dropdownYear.selectByVisibleText("1995");
		//dropdownYear.selectByIndex(10); //2014 - index 10
		dropdownYear.selectByValue("2017");

	}

}
