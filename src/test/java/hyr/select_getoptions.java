package hyr;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class select_getoptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		WebElement city = driver.findElementByXPath("//select[@name='city']");
		Select s= new Select(city);
		s.selectByVisibleText("Pune");
		s.selectByValue("Bh");
		s.selectByIndex(3);
		
		
		//we can use get options in stead of select by methods
		
		
		
		List<WebElement>options =  s.getOptions();
		for(WebElement opt:options) {
			if(opt.getText().equals("Pune")) {
				opt.click();
				break;
			}
		}
		
	}

}
