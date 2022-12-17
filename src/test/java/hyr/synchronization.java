package hyr;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		/* This is implicit wait
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 */
		
		//this is explicit wait
		
		driver.get("https://www.google.com/");
		
		WebElement search = driver.findElementByName("q");
		search.sendKeys("selenium webdriver");
		search.submit();
		/* This is explicit wait
		  WebDriverWait wait = new WebDriverWait(driver, 5);
			WebElement w =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='WebDriver - Selenium']")));
			w.click();*/
	}

}
