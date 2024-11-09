package day12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//1.Normal Alert
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000); // viweing the click operations
		//driver.switchTo().alert().accept();  //Click on OK button
		
		Alert myalert = driver.switchTo().alert();
		String str = myalert.getText();
		System.out.println(str);
		myalert.accept();
		
		String resultText = driver.findElement(By.id("result")).getText();
		System.out.println(resultText);
		
	}

}
