package hyr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggestdropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.findElementById("sb_form_q").sendKeys("selenium");
		//driver.findElementByClassName("sa_tm_text").click();
		List<WebElement> options =driver.findElementsByXPath("//div[@id='sw_as']//ul//li");
		for(WebElement opt:options) {
			if(opt.getText().equals("selenium tutorial")) {
				
				opt.click();
				break;
				
			}
			
			
		}
		
	}

}
