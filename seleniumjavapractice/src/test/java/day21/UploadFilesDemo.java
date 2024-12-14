package day21;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
		//Single file upload
		//WebElement element = driver.findElement(By.id("filesToUpload"));
		//element.sendKeys("C:\\Users\\SwaroopNadella\\OneDrive\\Desktop\\Swaroop2.txt");
		
		//String text = driver.findElement(By.xpath("//ul[@id=\"fileList\"]/li")).getText();
		//System.out.println(text);
		
		//Multiple Files Upload
		WebElement element = driver.findElement(By.id("filesToUpload"));
		String file1 = "C:\\Users\\SwaroopNadella\\OneDrive\\Desktop\\Swaroop1.txt";
		String file2 = "C:\\Users\\SwaroopNadella\\OneDrive\\Desktop\\Swaroop2.txt";
		element.sendKeys(file1+"\n"+file2);
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@id=\"fileList\"]/li"));
		System.out.println(elements.size());
		
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}
	}

}
