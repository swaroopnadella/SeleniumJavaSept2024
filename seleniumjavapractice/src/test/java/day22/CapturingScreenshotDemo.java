package day22;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenshotDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://academy.swaroopnadella.com/");
		driver.manage().window().maximize();
		
		/*
		//1) Full Web Page screenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		//File targetFile = new File("C:\\Users\\SwaroopNadella\\git\\SeleniumJavaSept2024\\seleniumjavapractice\\screenshots\\FullWebPage.png");
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\FullWebPage.png");
		sourceFile.renameTo(targetFile);
		*/
		
		/*
		//2) Capture Screenshot of certain section of the Web Page - WebElement
		WebElement section = driver.findElement(By.xpath("//div[@class=\"column full\"]"));
		File sourceFile = section.getScreenshotAs(OutputType.FILE);
		//File targetFile = new File("C:\\Users\\SwaroopNadella\\git\\SeleniumJavaSept2024\\seleniumjavapractice\\screenshots\\FullWebPage.png");
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\SectionScreenshot.png");
		sourceFile.renameTo(targetFile);
		*/
		
		//3) Capturing Individual Web Element
		WebElement text = driver.findElement(By.xpath("//h1[text()='Learn with Swaroop Nadella']"));
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		WebElement logo = driver.findElement(By.xpath("//img[@alt='logo']"));
		
		File sourceFile = logo.getScreenshotAs(OutputType.FILE);
		//File targetFile = new File("C:\\Users\\SwaroopNadella\\git\\SeleniumJavaSept2024\\seleniumjavapractice\\screenshots\\FullWebPage.png");
		File targetFile = new File(System.getProperty("user.dir")+"\\screenshots\\LogoScreenshot.png");
		sourceFile.renameTo(targetFile);
		
		driver.quit();
		
	}

}
