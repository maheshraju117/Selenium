package login;

import static org.testng.Assert.fail;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAnnotations {
	
	@Test
	public void bhiii() {
		
		System.out.println("hiii world");	
		
	}
	@BeforeTest
	public void ahello()
	{
		System.out.println("hello world");
	}
	@AfterTest
	
	public void chru()
	{
		System.out.println("how are you world");
	}

}
