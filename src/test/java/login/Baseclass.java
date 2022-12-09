package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	@Test
	public static void chromebrowser(String keyword) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(keyword);	
	}
	public static void orangehrm(String url,String log, String pass) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.findElementByName("username").sendKeys(log);
		driver.findElementByName("password").sendKeys(pass);
		driver.findElementByXPath("//*[@type='submit']").click();
	}
}
