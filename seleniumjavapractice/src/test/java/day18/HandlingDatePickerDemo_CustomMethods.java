package day18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDatePickerDemo_CustomMethods {

	// Select Month and Year
	static void selectMonthYear(WebDriver driver, String expectedMonth, String expectedYear, String pastOrfutureDate) {
		
		while (true) {

			String currentMonth = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

			if (currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
				break;
			}

			//driver.findElement(By.xpath("//span[text()='"+pastOrfutureDate+"']")).click();
			
			if(pastOrfutureDate.equals("PastDate")) {
				// Past Date
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			
			else
			{
				// Future Date
				driver.findElement(By.xpath("//span[text()='Next']")).click();

			}
			
			

		}
	}
	
	// Select Date from the Calendar
	static void selectDate(WebDriver driver, String expectedDate){
		
		List<WebElement> allDates = driver
				.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//tr/td//a"));

		for (WebElement date : allDates) {
			if (date.getText().equals(expectedDate)) {
				date.click();
				break;
			}
		}
	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		driver.switchTo().frame(0);

		// Approach 1 - typing the date value in the textbox
		// Date format syntax - mm/dd/yyyy
		// driver.findElement(By.id("datepicker")).sendKeys("12/31/2024");

		// Approach 2 - select date, month and year using the Calendar

		// Open the calendar by clicking on Date field
		driver.findElement(By.id("datepicker")).click();

		String expectedYear = "2027";
		String expectedMonth = "January";
		String expectedDate = "31";
		
		//selecting Month and year
		selectMonthYear(driver,expectedMonth,expectedYear,"FutureDate");

		// Select Date from the Calendar
		selectDate(driver,expectedDate);
		

	}

}
