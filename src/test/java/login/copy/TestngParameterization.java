package login.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngParameterization {

	@Test
	@Parameters({"username","password"})
	public void login(String a,String b) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElementByName("username").sendKeys(a);
		driver.findElementByName("password").sendKeys(b);
		driver.findElementByXPath("//button[@type='submit']").click();
		
		
	}

}
