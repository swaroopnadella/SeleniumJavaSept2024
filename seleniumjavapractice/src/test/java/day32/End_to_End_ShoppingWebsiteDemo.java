package day32;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class End_to_End_ShoppingWebsiteDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement men_MenuOption = driver.findElement(
				By.xpath("//header[@id='desktop-header-cnt']//a[text()='Men']"));
		Actions act = new Actions(driver);
		act.moveToElement(men_MenuOption).perform();
		
		driver.findElement(By.linkText("Sweatshirts")).click();
		
		//Click on the First Product
		driver.findElement(By.xpath("//img[@class='img-responsive']")).click();
		
		//Switch to the Opened Browser Tab
		String window2 = new ArrayList<String>(driver.getWindowHandles()).get(1);
		driver.switchTo().window(window2);
		
		String productTitle = driver.findElement(
				By.className("pdp-title")).getText();
		System.out.println(productTitle);
		
		String productName = driver.findElement(
				By.className("pdp-name")).getText();
		System.out.println(productName);
		
		String productPrice = driver.findElement(
				By.className("pdp-price")).getText();
		//System.out.println(productPrice);
		productPrice = productPrice.replaceAll("[^0-9]", "");
		System.out.println(productPrice);
		
		List<WebElement> buttons_Size = driver.findElements(
				By.className("size-buttons-size-button"));
		String productSize = "";
		for(WebElement button:buttons_Size) {
			button.click();
			productSize = button.getText(); //S, M, L
			//After First available Size is selected, Loop will break
			break;
		}
		System.out.println(productSize);
		
		driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[text()='GO TO BAG']")).click();
		
		//Cart validations
		String cart_ProductBrand = driver.findElement(
				By.className("itemContainer-base-brand")).getText();
		//System.out.println(cart_ProductBrand);
		if(cart_ProductBrand.contentEquals(productTitle))
			System.out.println("Product Brand information is matching, Test Passed");
		
		String cart_ProductName = driver.findElement(
				By.className("itemContainer-base-itemLink")).getText();
		//System.out.println(cart_ProductName);
		if(cart_ProductName.contentEquals(productName))
			System.out.println("Product Name information is matching, Test Passed");
		
		String cart_ProductSize = driver.findElement(
				By.className("itemComponents-base-size")).getText();
		//System.out.println(cart_ProductSize);
		cart_ProductSize = cart_ProductSize.replace("Size: ", "");
		//System.out.println(cart_ProductSize);
		if(cart_ProductSize.contentEquals(productSize))
			System.out.println("Product Size information is matching, Test Passed");
		
		String cart_ProductQuantity = driver.findElement(
				By.className("itemComponents-base-quantity")).getText();
		//System.out.println(cart_ProductQuantity);
		cart_ProductQuantity = cart_ProductQuantity.replace("Qty: ", "");
		//System.out.println(cart_ProductQuantity);
		if(cart_ProductQuantity.contentEquals("1"))
			System.out.println("Product Quanity information is matching, Test Passed");
		
		String cart_ProductPrice = driver.findElement(
				By.className("itemComponents-base-price")).getText();
		//System.out.println(cart_ProductPrice);
		cart_ProductPrice = cart_ProductPrice.replaceAll("[^0-9]", "");
		//System.out.println(cart_ProductPrice);
		if(cart_ProductPrice.contentEquals(productPrice))
			System.out.println("Product Price information is matching, Test Passed");
		
		
		driver.quit();
	}
}
