package day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		WebElement bootstrapDropdown = driver.findElement(
				By.xpath("//button[contains(@class,'multiselect')]"));
		bootstrapDropdown.click();
		
		//Click single option in the Bootstrap dropdown
		//driver.findElement(By.xpath("//input[@value=\"Bootstrap\"]")).click();
		//driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();
		
		//Retrieve all the Options from the dropdown
		List<WebElement> options = driver.findElements(
				By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
		for(WebElement option:options) {
			System.out.println(option.getText());
		}
		
		//Select multiple options from the dropdown
		for(WebElement option:options) {
			if(option.getText().equals("C#") || option.getText().equals("Angular")) 
			{
				option.click();
			}
		}
		
	}

}
