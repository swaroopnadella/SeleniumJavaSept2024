package day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropdownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		
		WebElement hiddenDropdown = driver.findElement(
				By.xpath("//label[text()='Job Title']/parent::div/following-sibling::div/div[@class=\"oxd-select-wrapper\"]"));
		hiddenDropdown.click();
		
		//driver.findElement(By.xpath("//span[text()='QA Engineer']")).click();
		//driver.findElement(By.xpath("//span[text()='QA Lead']")).click();
		//driver.findElement(By.xpath("//span[text()='Account Assistant']")).click();
		
		List<WebElement> dropdownOptions = driver.findElements(By.xpath("//div[@class=\"oxd-select-option\"]/span"));
		System.out.println(dropdownOptions.size());
		
		for(WebElement option:dropdownOptions) {
			System.out.println(option.getText());
		}
		
		driver.quit();
		
	}

}
