package login.copy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day16 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		//To store locator in a webelement//
		WebElement mahesh = driver.findElementById("twotabsearchtextbox");
		mahesh.sendKeys("pixel 6");
		mahesh.submit();
		String actual =driver.getCurrentUrl();
		String expected = "https://www.amazon.com/s?k=pixel";
		
		if(actual.contains("https://www.amazon.com/s?k=pixel"))
		{
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
	}

}
