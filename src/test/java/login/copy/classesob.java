package login.copy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class classesob 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElementByXPath("(//input[@type='text'])[1]").sendKeys("bengaluru");
		Thread.sleep(3000);
		driver.findElementByXPath("(//input[@type='text'])[2]").clear();
		driver.findElementByXPath("(//input[@type='text'])[2]").sendKeys("hyderabad");
		
	}
	
}
