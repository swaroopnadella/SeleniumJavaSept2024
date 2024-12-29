package day27;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVG_ElementsDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement leave_SvgElement = driver.findElement(By.xpath("(//a[@class=\"oxd-main-menu-item\"]//*[name()='svg'])[3]"));
		leave_SvgElement.click();
		
		List<WebElement> svg_Elements = driver.findElements(By.xpath("//*[name()='svg']//*[local-name()='g']"));
		System.out.println(svg_Elements.size());
		System.out.println("***********");
		for(WebElement ele:svg_Elements) {
			System.out.println(ele.getDomAttribute("fill"));
		}
		
	}

}
