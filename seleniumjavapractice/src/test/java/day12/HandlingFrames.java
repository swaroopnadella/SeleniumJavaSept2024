package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//switch to the frame
		//Frame1
		WebElement frame1 = driver.findElement(
				By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(frame1);
		
		WebElement textbox = driver.findElement(
				By.xpath("//input[@name=\"mytext1\"]"));
		textbox.sendKeys("Swaroop");
		
		driver.switchTo().defaultContent(); //come outside to main page
		
		//Frame2
		WebElement frame2 = driver.findElement(
				By.xpath("//frame[@src=\"frame_2.html\"]"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("mytext2")).sendKeys("Nadella");
		
		driver.switchTo().defaultContent(); //come out of frame 2
		
		//Frame3
		WebElement frame3 = driver.findElement(
				By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Academy");
		
		//iframe - inside Frame 3
		WebElement iframeElement = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(iframeElement);
		
		String text = driver.findElement(By.xpath("//div[@id='i1']")).getText();
		System.out.println(text);
		
		driver.findElement(By.id("i21")).click();
		driver.findElement(By.id("i24")).click();
		driver.findElement(By.id("i27")).click();
		
		driver.switchTo().defaultContent();
		
		//Frame4
		WebElement frame4 = driver.findElement(
				By.xpath("//frame[@src=\"frame_4.html\"]"));
		driver.switchTo().frame(frame4);
		driver.findElement(By.name("mytext4")).sendKeys("SeleniumJavaFrames");
		
		driver.switchTo().defaultContent(); //Come outside to the main page
		
		//write code for subsequent elements in the main page
	}

}
