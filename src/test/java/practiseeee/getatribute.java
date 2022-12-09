package practiseeee;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getatribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		List<WebElement>lang = driver.findElementsByXPath("//*[@name='lang']");
		for (int i = 0; i < lang.size(); i++) {
			
			WebElement abc = lang.get(i);
				String x =	abc.getAttribute("id");
			System.out.println(x);
			if(x.equalsIgnoreCase("ruBy")) {
				abc.click();
			}
		}	
	}
}	
