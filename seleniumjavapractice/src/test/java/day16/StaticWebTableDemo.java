package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) Find the number of rows in the table -- tr
		int rows = driver.findElements(
				By.xpath("//table[@name=\"BookTable\"]//tr")).size();
		
		//int rows = driver.findElements(By.xpath("//tr")).size(); //Single web table
		//System.out.println(rows);
		
		//2) Find the number of columns in the table -- th
		int columns = driver.findElements(
				By.xpath("//table[@name=\"BookTable\"]//tr[1]/th")).size();
		//System.out.println(columns);
		
		//3) Retrieve data from specific row and column - 4th row 3rd column
		String value = driver.findElement(
				By.xpath("//table[@name=\"BookTable\"]//tr[4]/td[3]")).getText();
		//System.out.println(value);
		
		//4) Retrieve all the data from the web table - rows and columns
		
		//print the header
		/*
		for(int col=1;col<=columns;col++) {
			String val = driver.findElement(
					By.xpath("//table[@name=\"BookTable\"]//tr[1]/th["+col+"]")).getText();
			System.out.print(val+"  ");
		}
		System.out.println();
		
		for(int row=2;row<=rows;row++) {
			for(int col=1;col<=columns;col++) {
				String val = driver.findElement(
						By.xpath("//table[@name=\"BookTable\"]//tr["+row+"]/td["+col+"]")).getText();
				System.out.print(val+"  ");
			}
			System.out.println();
		}
		*/
		
		//5) Print the Book name written by given Author - Amit
		/*
		for(int row=2;row<=rows;row++) {
			String author = driver.findElement(
					By.xpath("//table[@name=\"BookTable\"]//tr["+row+"]/td[2]")).getText();
			//System.out.println(author);
			if(author.equals("Amit")) {
				String bookName = driver.findElement(
						By.xpath("//table[@name=\"BookTable\"]//tr["+row+"]/td[1]")).getText();
				System.out.println(bookName+"\t"+author);
			}
		} */
		
		//6) Total price of all the Books
		int total = 0;
		for(int row = 2;row<=rows;row++) {
			String price = driver.findElement(
					By.xpath("//table[@name=\"BookTable\"]//tr["+row+"]/td[4]")).getText();
			//System.out.println(price);
			total = total + Integer.parseInt(price);
		}
		System.out.println(total);
		
		driver.quit();
		
	}

}
