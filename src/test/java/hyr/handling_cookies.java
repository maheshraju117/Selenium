package hyr;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import practise.set;

public class handling_cookies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		// this will get the size of a cookie
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		//this will print cookie name and value
		for(Cookie cook:cookies) {
			System.out.println(cook.getName()+"  :  "+ cook.getValue());
		}
		
		//this will add new cookie
		Cookie cook = new Cookie("rudraraju", "maheshrudraraju4@gmail.com");
		driver.manage().addCookie(cook);
		Set<Cookie>cookies1= driver.manage().getCookies();
		System.out.println(cookies1.size());
		
		
		//this will delete cookie
		driver.manage().deleteCookie(cook);
		
		//this will delete cookiewithnamed
		driver.manage().deleteCookieNamed("rudraraju");
		
		//this will delete all cookies
		driver.manage().deleteAllCookies();
		
		driver.quit();
		
	}

}
