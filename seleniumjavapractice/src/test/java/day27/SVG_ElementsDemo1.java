package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_ElementsDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("file:///C:/Users/SwaroopNadella/OneDrive/Desktop/Swaroop.HTML");
		driver.manage().window().maximize();
		
		String value = driver.findElement(By.xpath("//*[local-name()='text']")).getText();
		System.out.println(value);
		
		String color = driver.findElement(By.xpath("//*[local-name()='rect']")).getDomAttribute("fill");
		System.out.println(color);
		
		String color_cirle = driver.findElement(By.xpath("//*[local-name()='circle']")).getDomAttribute("fill");
		System.out.println(color_cirle);
		
		String stroke_path = driver.findElement(By.xpath("//*[local-name()='path']")).getDomAttribute("stroke");
		System.out.println(stroke_path);
		
		String d_path = driver.findElement(By.xpath("//*[local-name()='path']")).getDomAttribute("d");
		System.out.println(d_path);

	}

}
