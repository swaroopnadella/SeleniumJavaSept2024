package day23;

import java.awt.Color;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue_ColorValidationDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//rgba(49, 122, 231, 1)
		String rgba = loginButton.getCssValue("background-color");
		System.out.println(rgba);
		
		//[49,  122,  231,  1]
		String numbers[] = rgba.replace("rgba(", "").replace(")", "").split(",");
		
		Color color = new Color(Integer.parseInt(numbers[0].trim()), 
				Integer.parseInt(numbers[1].trim()), 
				Integer.parseInt(numbers[2].trim()));
		
		String hexaDecimalVal = Integer.toHexString(color.getRGB());
		System.out.println(hexaDecimalVal.substring(2));
		
		if(hexaDecimalVal.substring(2).equals("317ae7"))
			System.out.println("Color is Matching, Test is Passed");
		
		driver.quit();
	}

}
