package day28;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementsDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://play1.automationcamp.ir/advanced");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.className("star-rating"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return window.getComputedStyle(arguments[0],'::after').getPropertyValue('content')";
		String content = js.executeScript(script, element).toString();
		System.out.println(content);
		String outputText = content.replaceAll("\"", "");
		System.out.println(outputText);
		
		driver.findElement(By.id("txt_rating")).sendKeys(outputText);
		driver.findElement(By.id("check_rating")).click();
		
		String result = driver.findElement(By.id("validate_rating")).getText();
		if(result.equals("Well done!"))
			System.out.println("Test is Passed");
		else
			System.out.println("Test is Failed");
		
		driver.quit();
	}

}
