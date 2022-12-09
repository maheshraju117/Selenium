package practiseeee;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testngannotation {
	
	
	ChromeDriver driver;
	
  @Test
  public void enterlogincredentials() {
	  driver.findElementByName("username").sendKeys("admin");
	  driver.findElementByName("password").sendKeys("admin123");
	  driver.findElementByXPath("//button[@type='submit']").click();
	  
  }
  @BeforeMethod
  public void launchbrowser() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

  @AfterMethod
  public void closebrowser() {
	  driver.findElementByXPath("//span[@class='oxd-userdropdown-tab']").click();
	  driver.findElementByXPath("//*[text()='Logout']").click();
	  
	  
  }

  @BeforeTest(groups = "checkolist")
  public void introduction() {
	  
	  System.out.println("hey mahesh your test execution is started");
  }

  @AfterTest(groups = "checkolist")
  public void closing() {
	  
	  System.out.println("hey mahesh your test execution id ended");
	  
  }

}
