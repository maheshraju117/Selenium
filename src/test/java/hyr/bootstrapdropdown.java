package hyr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bootstrapdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		driver.findElementByXPath("//div[@class='drp1']").click();
		List<WebElement>options = driver.findElementsByXPath("//ul[@class='dropdown1 dropdown-menu']//li");
		for(WebElement opt:options) {
			if(opt.getText().equals("Loans")) {
				
				opt.click();
			}	
		}
		driver.findElementByXPath("//div[@class='drp2']").click();
		List<WebElement> options2 = driver.findElementsByXPath("//ul[@class='dropdown2 dropdown-menu']//li");
		for(WebElement opt2:options2) {
			
			if(opt2.getText().equals("New Car Loan")) {
				opt2.click();
				break;
			}
			
			
		}
		
		
		
		
		
	}
}
