package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames/");

		// Frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.name("mytext3")).sendKeys("Swaroop");

		// iframe - inside Frame 3
		//WebElement iframeElement = driver.findElement(By.tagName("iframe"));
		//driver.switchTo().frame(iframeElement);
		driver.switchTo().frame(0);

		String text = driver.findElement(By.xpath("//div[@id='i1']")).getText();
		System.out.println(text);

		driver.findElement(By.id("i21")).click();
		driver.findElement(By.id("i24")).click();
		driver.findElement(By.id("i27")).click();

		//driver.switchTo().defaultContent(); // control comes to main page
		
		//switching to the parentframe
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		WebElement textbox = driver.findElement(By.name("mytext3"));
		textbox.clear();
		textbox.sendKeys("Test");

	}

}
