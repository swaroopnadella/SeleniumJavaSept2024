package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo3 {

	public static void main(String[] args) {
		
		//isSelected() - true/false
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
		WebElement femaleRadioButton = driver.findElement(By.id("gender-female"));
		WebElement newsletterCheckbox = driver.findElement(By.id("Newsletter"));
		
		System.out.println(maleRadioButton.isSelected());
		System.out.println(femaleRadioButton.isSelected());
		System.out.println(newsletterCheckbox.isSelected());

	}

}
