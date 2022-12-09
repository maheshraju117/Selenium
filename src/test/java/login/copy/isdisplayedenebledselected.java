package login.copy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class isdisplayedenebledselected {
	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://softwaretesting-guru.blogspot.com/p/blog-page.html");
		driver.findElementByName("photo").sendKeys("C:\\Users\\Syam\\Downloads\\EA-Resume_07-May-19_06.51.33.doc");
		if(driver.findElementByName("Name").isDisplayed()&&driver.findElementByName("Name").isEnabled()) {
			System.out.println("the table is displayed and enebled");}
			else {System.out.println("the input box is not displayed and enebled");
				
			}
		
		if(!driver.findElementByName("subscribe").isSelected()) {
			driver.findElementByName("subscribe").click();
			
		}
		}

}
