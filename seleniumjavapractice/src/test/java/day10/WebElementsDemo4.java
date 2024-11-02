package day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsDemo4 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://bookcart.azurewebsites.net/");
		
		WebElement Login = driver.findElement(
				By.xpath("//span[contains(text(),'Login')]"));
		Login.click();
		
		Thread.sleep(5000);
		WebElement Register = driver.findElement(
				By.xpath("//span[text()='Register']"));
		Register.click();
		
		Thread.sleep(5000);
		WebElement maleRadioButton = driver.findElement(
				By.xpath("//input[@value='Male']"));
		
		WebElement femaleRadioButton = driver.findElement(
				By.xpath("//input[@value='Female']"));
		
		System.out.println(maleRadioButton.isSelected());
		System.out.println(femaleRadioButton.isSelected());
		
		System.out.println("Male radio button is clicked");
		maleRadioButton.click();
		System.out.println(maleRadioButton.isSelected());
		System.out.println(femaleRadioButton.isSelected());
		
		System.out.println("Female radio button is clicked");
		femaleRadioButton.click();
		System.out.println(maleRadioButton.isSelected());
		System.out.println(femaleRadioButton.isSelected());
		

	}

}
