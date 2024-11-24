package day17;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.ecomdeveloper.com/demo/admin/index.php");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("input-username")).sendKeys("demoadmin");
		driver.findElement(By.id("input-password")).sendKeys("demopass");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//main menu Customers
		driver.findElement(By.id("menu-customer")).click();
		
		//Submenu Customers
		driver.findElement(
				By.xpath("//ul[@id=\"collapse9\"]//a[text()='Customers']")).click();
		
		//Webtable is loaded
		//Get the Number of pages
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		//System.out.println(text);
		
		String pages = text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);
		//System.out.println(pages);
		int numOfPages = Integer.parseInt(pages);
		
		//Looping through the pages
		for(int page=1;page<=numOfPages;page++) {
			
			if(page>1) {
				driver.findElement(
						By.xpath("//ul[@class=\"pagination\"]//a[text()='"+page+"']")).click();
			}
			
			//get the number of rows
			int rows = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]/tbody/tr")).size();
			//System.out.println(rows);
			
			for(int row=1;row<=rows;row++) {
				//Retrieve the data from the web table row
				
				String customerName = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]/tbody/tr["+row+"]/td[2]")).getText();
				
				String email = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]/tbody/tr["+row+"]/td[3]")).getText();
				
				String dateAdded = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]/tbody/tr["+row+"]/td[7]")).getText();
				
				System.out.println(customerName+"\t"+email+"\t"+dateAdded);
			}
			
		}
	}

}
