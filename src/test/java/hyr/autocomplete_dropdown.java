package hyr;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autocomplete_dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	
		driver.get("https://www.twoplugs.com/newsearchserviceneed");
		driver.manage().window().maximize();
		WebElement searchbox = driver.findElementById("autocomplete");
		searchbox.clear();
		searchbox.sendKeys("Toronto");
		Thread.sleep(3000);
		String a;
		
		do {
			searchbox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			a =searchbox.getAttribute("Value");
			if(a.equals("Toronto, OH, USA")) {
			searchbox.sendKeys(Keys.ENTER);
			break;
			}
			Thread.sleep(5000);
		} while (!a.isEmpty());
		
	}

}
