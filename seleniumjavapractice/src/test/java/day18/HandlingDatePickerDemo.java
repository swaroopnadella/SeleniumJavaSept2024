package day18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePickerDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		//Approach 1 - typing the date value in the textbox
		//Date format syntax - mm/dd/yyyy
		//driver.findElement(By.id("datepicker")).sendKeys("12/31/2024");
		
		//Approach 2 - select date, month and year using the Calendar
		
		//Open the calendar by clicking on Date field
		driver.findElement(By.id("datepicker")).click();
		
		String expectedYear = "2023";
		String expectedMonth = "April";
		String expectedDate = "20";
		
		//Select Month and Year
		while(true) {
			
			String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
				break;
			}
			
			//Future Date
			//driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			//Past Date
			driver.findElement(By.xpath("//span[text()='Prev']")).click();
			
		}
		
		//Select Date from the Calendar
		
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr/td//a"));
		
		for(WebElement date:allDates) {
			if(date.getText().equals(expectedDate)) {
				date.click();
				break;
			}
		}
		
		
	}

}
