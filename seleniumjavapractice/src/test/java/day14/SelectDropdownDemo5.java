package day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownDemo5 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/r.php");
		driver.manage().window().maximize();

		WebElement day = driver.findElement(By.name("birthday_day"));
		Select dropdownDay = new Select(day);

		// Existing selection on the web page
		WebElement selectedDay = dropdownDay.getFirstSelectedOption();
		System.out.println(selectedDay.getText());

		WebElement month = driver.findElement(By.name("birthday_month"));
		Select dropdownMonth = new Select(month);

		// Existing selection on the web page
		WebElement selectedMonth = dropdownMonth.getFirstSelectedOption();
		System.out.println(selectedMonth.getText());

		WebElement year = driver.findElement(By.name("birthday_year"));
		Select dropdownYear = new Select(year);

		// Existing selection on the web page
		WebElement selectedYear = dropdownYear.getFirstSelectedOption();
		System.out.println(selectedYear.getText());
	}

}
