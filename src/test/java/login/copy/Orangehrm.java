package login.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Orangehrm 
{
	@Test
	@Parameters({"user","pass"})
	public void mahesh(String user,String pass)
	{	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new  ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.findElement(By.name("username")).sendKeys(user);		
	driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
