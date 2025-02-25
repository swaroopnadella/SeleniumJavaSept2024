package day31;


import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//1) Retrieve all the Cookies in the Browser session
		Set<Cookie> cookies1 = driver.manage().getCookies();
		System.out.println(cookies1);
		System.out.println(cookies1.size());
		
		//2) Print All the Cookies - for loop
		for(Cookie co:cookies1) {
			System.out.println(co);
		}
		
		//3) Print All Cookies based on Name and Value
		System.out.println("---------Print Cookie Name and Value");
		for(Cookie co:cookies1) {
			System.out.println(co.getName()+" : "+co.getValue());
		}
		
		//4) Retrieve Specific Cookie by Name
		System.out.println("----------Print Specific Cookie by Name - NID");
		Cookie nid_Cookie = driver.manage().getCookieNamed("NID");
		System.out.println(nid_Cookie);
		System.out.println(nid_Cookie.getValue());
		
		//5) Add Cookie Object to the browser session
		System.out.println("----------Add Cookie Object to the browser session");
		Cookie cookie_1 = new Cookie("TestCookie1","CookieValue1");
		Cookie cookie_2 = new Cookie("TestCookie2","CookieValue2");
		driver.manage().addCookie(cookie_1);
		driver.manage().addCookie(cookie_2);
		Set<Cookie> cookies2 = driver.manage().getCookies();
		System.out.println(cookies2.size());
		for(Cookie co:cookies2) {
			System.out.println(co);
		}
		
		//6) Delete Cookie Object
		driver.manage().deleteCookie(cookie_1);
		System.out.println("-----Deleting Cookie Object");
		Set<Cookie> cookies3 = driver.manage().getCookies();
		System.out.println(cookies3.size());
		for(Cookie co:cookies3) {
			System.out.println(co);
		}
		
		//7) Delete Cookie by Name
		driver.manage().deleteCookieNamed("TestCookie2");
		driver.manage().deleteCookieNamed("NID");
		System.out.println("-----Deleting Cookie by Name");
		Set<Cookie> cookies4 = driver.manage().getCookies();
		System.out.println(cookies4.size());
		for(Cookie co:cookies4) {
			System.out.println(co);
		}
		
		//8) Delete All the Cookies
		driver.manage().deleteAllCookies();
		System.out.println("-----Deleting All Cookies");
		Set<Cookie> cookies5 = driver.manage().getCookies();
		System.out.println(cookies5.size());
		for(Cookie co:cookies5) {
			System.out.println(co);
		}

		
		driver.quit();
		
	}
}
