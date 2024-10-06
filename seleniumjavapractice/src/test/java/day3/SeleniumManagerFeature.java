package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumManagerFeature {

	public static void main(String[] args) throws InterruptedException {
		
		//Using the Chrome for testing
		/*
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("beta");
		options.setBinary("path of the chrome browser for testing");
		options.setBinary("C:\\Users\\SwaroopNadella\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		*/
		
		//Launch the chrome browser
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		
		String text = driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println(text);
		
		String price = driver.findElement(By.className("inventory_item_price")).getText();
		System.out.println(price);
	}

}
