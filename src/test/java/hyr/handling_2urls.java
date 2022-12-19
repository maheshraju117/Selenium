package hyr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handling_2urls {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.opencart.com/");
		//driver.switchTo().newwindow(WindowType.TAB);
		//this will open 2 url's in a 2 tabls
		
		//driver.switchTo().newwindow(WindowType.WINDOW);
		//this will open 2 url's in a 2 windows
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		// this feature will work only after selenium 4.0
		
		
		//this can open alink in another tab
		String contact = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElementByXPath("//a[text()='Contact Us']").sendKeys(contact);
		
	}

}
