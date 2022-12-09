package practiseeee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbsignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElementByXPath("//*[starts-with(@id,'u_0_0_')]").click();
		driver.findElementByName("firstname").sendKeys("shiva");
		driver.findElementByName("lastname").sendKeys("alluri");
		driver.findElementByName("reg_email__").sendKeys("bokka@gmail.com");
		driver.findElementByName("reg_passwd__").sendKeys("bokka@123");
		driver.findElementByName("reg_email_confirmation__").sendKeys("bokka@gmail.com");
		WebElement day = driver.findElementById("day");
		WebElement month = driver.findElementById("month");
		WebElement year = driver.findElementById("year");
		Select s = new Select(day);
		s.selectByValue("10");
		Select s1 = new Select(month);
		s1.selectByVisibleText("Jun");
		Select s2 = new Select(year);
		s2.selectByValue("1993");
		driver.findElementByXPath("//*[text()='Male']").click();
		driver.findElementByXPath("//button[@name='websubmit']").click();
		
		
		
		
		
		

	}

}
