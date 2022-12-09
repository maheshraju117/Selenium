package practiseeee;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifypagetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		String expected = driver.getTitle();
		String actual = "Selenium Practise: Bootstrap Dropdown Example for Selenium";
		//System.out.println(expected);
		Assert.assertEquals(actual, expected);
		System.out.println("assert equals completed");
		Assert.assertTrue(actual.contains("Selenium Practise: Bootstrap "));
		System.out.println("assert true completed");
	}

}
