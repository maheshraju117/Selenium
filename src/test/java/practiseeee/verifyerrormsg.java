package practiseeee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyerrormsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/login");
		driver.findElementById("email").sendKeys("abcvgdf");
		driver.findElementById("loginbutton").click();
		String actual = driver.findElementByXPath("//*[@class='_9ay7']").getText();
		String expected = driver.findElementByXPath("//*[@class='_9ay7']").getAttribute("textContent");
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		System.out.println("test passed");
		
		
		
	}

}
