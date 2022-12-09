package login.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selpractisepage {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
	driver.findElementByName("Name").sendKeys("mahesh");
	if(!driver.findElementByXPath("//*[@type='checkbox']").isSelected()) {
		driver.findElementByXPath("//*[@type='checkbox']").click();
	}
	driver.findElementByName("comments").sendKeys("hellow world this is mahesh");
	WebElement countries = driver.findElementByName("countries");
	Select driver1 = new Select(countries);
	driver1.selectByVisibleText("Afganistain");
	WebElement computerbrands = driver.findElementByName("computerbrands");
	Select driver2 = new Select(computerbrands);
	driver2.deselectAll();
	driver2.selectByVisibleText("IBM");
	driver2.selectByVisibleText("Compaq");
	driver2.selectByVisibleText("Sony");
	driver.findElementByName("pwd").sendKeys("Qwerty@123");
	driver.findElementByXPath("//*[@value='good']").click();
	driver.findElementByXPath("(//*[@type='button'])[1]").click();

	}

}
